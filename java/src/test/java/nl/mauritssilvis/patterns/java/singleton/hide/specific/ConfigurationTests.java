/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.hide.specific;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConfigurationTests {
    @Test
    void getTheSameConfiguration() {
        Configuration configuration1 = Configuration.getInstance();
        Configuration configuration2 = Configuration.getInstance();

        Assertions.assertEquals(configuration1, configuration2);
    }

    @Test
    void checkAccess() {
        Configuration configuration = Configuration.getInstance();
        configuration.setAccess(false);

        Assertions.assertFalse(configuration.isAccessible());
    }

    @Test
    void changeAccess() {
        Configuration configuration1 = Configuration.getInstance();
        Configuration configuration2 = Configuration.getInstance();
        configuration2.setAccess(true);

        Assertions.assertAll(
                () -> Assertions.assertTrue(configuration1.isAccessible()),
                () -> Assertions.assertTrue(configuration2.isAccessible())
        );
    }
}