package com.tosan.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author AmirHossein ZamanZade
 * @since 8/2/2022
 */
public class ServiceUtilUTest {
    private ServiceUtil util;

    @BeforeEach
    public void setup() {
        util = new ServiceUtil();
    }

    @Test
    public void testGetCutCamelCasesBySpace_WithoutCamelCase_WithoutSpace() {
        String s = "amirhossein";
        Assertions.assertEquals(s, util.getCutCamelCasesBySpace(s));
    }

    @Test
    public void testGetCutCamelCasesBySpace_WithCamelCase_WithSpace() {
        String s = "AmirHossein";
        String expected = "Amir Hossein";
        Assertions.assertEquals(expected, util.getCutCamelCasesBySpace(s));
    }
}
