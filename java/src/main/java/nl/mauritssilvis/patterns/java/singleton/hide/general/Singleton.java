/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.hide.general;

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return new Singleton();
    }
}
