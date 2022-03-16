/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.protect.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NoSingletonChildTests {
    @Test
    void getDifferentInstances() {
        NoSingleton noSingleton1 = NoSingletonChild.getParentInstance();
        NoSingleton noSingleton2 = NoSingletonChild.getParentInstance();

        Assertions.assertNotSame(noSingleton1, noSingleton2, "The same instance of NoSingleton was retrieved.");
    }
}