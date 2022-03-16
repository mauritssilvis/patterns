/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.protect.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NoSingletonTests {
    @Test
    void getTheSameInstanceTwice() {
        NoSingleton noSingleton1 = NoSingleton.getInstance();
        NoSingleton noSingleton2 = NoSingleton.getInstance();

        Assertions.assertEquals(noSingleton1, noSingleton2);
    }
}