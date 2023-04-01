/*
 * Copyright © 2022, 2023 Maurits Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.enumerate.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTests {
    @Test
    void getTheSameSingletonInstance() {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        Assertions.assertSame(singleton1, singleton2, "Two Singleton enum instances were created.");
    }
}