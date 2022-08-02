package com.tosan.util;

import org.springframework.stereotype.Component;

/**
 * @author AmirHossein ZamanZade
 * @since 8/1/2022
 */
@Component
public class ServiceUtil {
    public String getCutCamelCasesBySpace(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            if (tmp.matches("[A-Z]")) {
                result.append(" ");
            }
            result.append(tmp);
        }
        return result.toString().trim();
    }
}
