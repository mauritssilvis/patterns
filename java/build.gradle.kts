/*
 * Copyright © 2022, 2023 Maurits H. Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

plugins {
    java
    id("com.github.ben-manes.versions") version "0.46.0"
}

group = "nl.mauritssilvis.patterns.java"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }
}

tasks {
    test {
        useJUnitPlatform()
    }
}
