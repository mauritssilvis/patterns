/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.hide.specific;

public final class Configuration {
    private static final Configuration INSTANCE = new Configuration();

    private boolean accessible;

    private Configuration() {
    }

    public static Configuration getInstance() {
        return INSTANCE;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }
}
