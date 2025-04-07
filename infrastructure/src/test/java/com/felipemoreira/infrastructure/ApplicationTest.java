package com.felipemoreira.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    void testApplication() {
        Assertions.assertNotNull(new Application());
        Application.main(new String[]{});
    }
}
