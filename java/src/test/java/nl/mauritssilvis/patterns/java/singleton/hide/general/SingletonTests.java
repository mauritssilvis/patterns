/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.hide.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTests {
    @Test
    void getTheSameInstanceTwice() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Fails
        Assertions.assertEquals(singleton1, singleton2);
    }
}