/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.hide.specific;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConfigurationTests {
    @Test
    void getTheSameConfigurationInstance() {
        Configuration configuration1 = Configuration.getInstance();
        Configuration configuration2 = Configuration.getInstance();

        Assertions.assertSame(configuration1, configuration2, "Two Configuration instances were created.");
    }

    @Test
    void checkAccess() {
        Configuration configuration = Configuration.getInstance();
        configuration.setAccess(false);

        Assertions.assertFalse(configuration.isAccessible(), "The Configuration object has an unexpected accessibility.");
    }

    @Test
    void changeAccess() {
        Configuration configuration1 = Configuration.getInstance();
        Configuration configuration2 = Configuration.getInstance();
        configuration2.setAccess(true);

        Assertions.assertAll(
                () -> Assertions.assertTrue(configuration1.isAccessible(), "The first Configuration object has an unexpected accessibility."),
                () -> Assertions.assertTrue(configuration2.isAccessible(), "The second Configuration object has an unexpected accessibility.")
        );
    }
}