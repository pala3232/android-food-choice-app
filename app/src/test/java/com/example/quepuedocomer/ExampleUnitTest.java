package com.example.quepuedocomer;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    
    @Test
    public void app_name_isNotEmpty() {
        String appName = "Que Puedo Comer";
        assertNotNull(appName);
        assertFalse(appName.isEmpty());
    }
}
