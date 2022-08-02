package com.tosan.controller;

import com.tosan.service.AuthorInvoker;
import com.tosan.service.HelloWorldInvoker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author AmirHossein ZamanZade
 * @since 8/2/2022
 */
public class ControllerUTest {

    private Controller controller;
    private AuthorInvoker authorInvoker;
    private HelloWorldInvoker helloWorldInvoker;

    @BeforeEach
    public void setup() {
        authorInvoker = Mockito.mock(AuthorInvoker.class);
        helloWorldInvoker = Mockito.mock(HelloWorldInvoker.class);
        controller = new Controller(authorInvoker, helloWorldInvoker);
    }

    @Test
    public void testGetHelloWorld() {
        Mockito.when(helloWorldInvoker.sayHelloWorld(Mockito.any())).thenReturn("Hello Stranger");
        ResponseEntity<String> responseEntity = controller.getHelloWorld(null);
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Hello Stranger", responseEntity.getBody());
    }

    @Test
    public void testGetAuthor() {
        Mockito.when(authorInvoker.getAuthorName()).thenReturn("Amirhossein Zamanzade");
        ResponseEntity<String> responseEntity = controller.getAuthor();
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Amirhossein Zamanzade", responseEntity.getBody());
    }
}
