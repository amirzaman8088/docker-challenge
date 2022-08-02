package com.tosan.service.invokerImpl;

import com.tosan.service.AuthorInvoker;
import org.springframework.stereotype.Component;

/**
 * @author AmirHossein ZamanZade
 * @since 8/1/2022
 */
@Component
public class AuthorInvokerImpl implements AuthorInvoker {
    @Override
    public String getAuthorName() {
        return "AmirHossein ZamanZade";
    }
}
