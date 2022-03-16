/*
 * Copyright © 2022 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package nl.mauritssilvis.patterns.java.singleton.hide.specific;

public class Configuration {
    private static final Configuration CONFIGURATION = new Configuration();

    private boolean accessible = false;

    private Configuration() {
    }

    public static Configuration getInstance() {
        return CONFIGURATION;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccess(boolean accessible) {
        this.accessible = accessible;
    }
}
