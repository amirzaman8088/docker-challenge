package com.tosan.service.inovkerImpl;

import com.tosan.service.invokerImpl.AuthorInvokerImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author AmirHossein ZamanZade
 * @since 8/2/2022
 */
public class AuthorInvokerImplUTest {
    private AuthorInvokerImpl invoker;

    @BeforeEach
    public void setup() {
        invoker = new AuthorInvokerImpl();
    }

    @Test
    public void testGetAuthorName() {
        Assertions.assertEquals("AmirHossein ZamanZade", invoker.getAuthorName());
    }
}
