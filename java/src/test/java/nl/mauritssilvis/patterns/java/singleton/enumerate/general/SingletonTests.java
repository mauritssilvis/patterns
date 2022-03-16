/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.enumerate.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTests {
    @Test
    void getTheSameSingletonInstance() {
        Singleton singleton1 = Singleton.SINGLETON;
        Singleton singleton2 = Singleton.SINGLETON;

        Assertions.assertSame(singleton1, singleton2, "Two Singleton enum instances were created.");
    }
}