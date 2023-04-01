/*
 * Copyright © 2022, 2023 Maurits Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.protect.general.child;

import nl.mauritssilvis.patterns.java.singleton.protect.general.NoSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NoSingletonChildTests {
    @Test
    void getDifferentNoSingletonInstances() {
        NoSingleton noSingleton1 = NoSingletonChild.getInstance();
        NoSingleton noSingleton2 = NoSingletonChild.getInstance();

        Assertions.assertNotSame(noSingleton1, noSingleton2, "The same NoSingleton instance was retrieved.");
    }
}