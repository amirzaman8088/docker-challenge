package com.tosan.service.invokerImpl;

import com.tosan.service.HelloWorldInvoker;
import com.tosan.util.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author AmirHossein ZamanZade
 * @since 8/1/2022
 */
@Component
@RequiredArgsConstructor
public class HelloWorldInvokerImpl implements HelloWorldInvoker {

    private final ServiceUtil serviceUtil;

    @Override
    public String sayHelloWorld(String name) {
        if (name == null) {
            return "Hello Stranger";
        }
        return serviceUtil.getCutCamelCasesBySpace(name);
    }
}
