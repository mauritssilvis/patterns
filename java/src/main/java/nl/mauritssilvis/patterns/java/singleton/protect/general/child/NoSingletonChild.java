/*
 * Copyright © 2022, 2023 Maurits Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.protect.general.child;

import nl.mauritssilvis.patterns.java.singleton.protect.general.NoSingleton;

public final class NoSingletonChild extends NoSingleton {
    private NoSingletonChild() {
    }

    public static NoSingleton getInstance() {
        return new NoSingletonChild();
    }
}
