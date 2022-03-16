/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.protect.general;

public class NoSingletonChild extends NoSingleton {
    public static NoSingleton getParentInstance() {
        return new NoSingleton();
    }
}
