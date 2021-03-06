/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.protect.general;

public class NoSingleton {
    private static final NoSingleton INSTANCE = new NoSingleton();

    protected NoSingleton() {
    }

    public static NoSingleton getInstance() {
        return INSTANCE;
    }
}
