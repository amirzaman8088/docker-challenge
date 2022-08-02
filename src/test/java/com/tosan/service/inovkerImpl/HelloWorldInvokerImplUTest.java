package com.tosan.service.inovkerImpl;

import com.tosan.service.invokerImpl.HelloWorldInvokerImpl;
import com.tosan.util.ServiceUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author AmirHossein ZamanZade
 * @since 8/2/2022
 */
public class HelloWorldInvokerImplUTest {

    private HelloWorldInvokerImpl invoker;
    private ServiceUtil util;

    @BeforeEach
    public void setup() {
        util = Mockito.mock(ServiceUtil.class);
        invoker = new HelloWorldInvokerImpl(util);
    }

    @Test
    public void testSayHelloWorld_WithoutName() {
        Assertions.assertEquals("Hello Stranger", invoker.sayHelloWorld(null));
    }

    @Test
    public void testSayHelloWorld_WithName() {
        String expected = "Amirhossein";
        Mockito.when(util.getCutCamelCasesBySpace(Mockito.any())).thenReturn(expected);
        Assertions.assertEquals("Hello " + expected, invoker.sayHelloWorld(expected));
    }
}
