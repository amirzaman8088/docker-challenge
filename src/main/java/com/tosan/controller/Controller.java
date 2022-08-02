package com.tosan.controller;

import com.tosan.service.AuthorInvoker;
import com.tosan.service.HelloWorldInvoker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AmirHossein ZamanZade
 * @since 8/1/2022
 */
@RestController
@RequiredArgsConstructor
public class Controller {

    private final AuthorInvoker authorInvoker;
    private final HelloWorldInvoker helloWorldInvoker;

    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getHelloWorld(@RequestParam(required = false) String name) {
        return ResponseEntity.status(HttpStatus.OK).body(helloWorldInvoker.sayHelloWorld(name));
    }

    @GetMapping(value = "/author", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAuthor() {
        return ResponseEntity.status(HttpStatus.OK).body(authorInvoker.getAuthorName());
    }
}
