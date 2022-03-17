/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.protect.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NoSingletonTests {
    @Test
    void getTheSameNoSingletonInstance() {
        NoSingleton noSingleton1 = NoSingleton.getInstance();
        NoSingleton noSingleton2 = NoSingleton.getInstance();

        Assertions.assertSame(noSingleton1, noSingleton2, "Two NoSingleton instances were created.");
    }

    @Test
    void getDifferentNoSingletonInstances() {
        NoSingleton noSingleton1 = new NoSingleton();
        NoSingleton noSingleton2 = new NoSingleton();

        Assertions.assertNotSame(noSingleton1, noSingleton2, "The same NoSingleton instance was constructed.");
    }
}