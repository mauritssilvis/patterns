/*
 * Copyright © 2022, 2023 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

plugins {
    java
}

group = "nl.mauritssilvis.patterns.java"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }
}

tasks {
    test {
        useJUnitPlatform()
    }
}