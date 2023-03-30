/*
 * Copyright © 2022, 2023 Maurits Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

plugins {
    java
}

group = "nl.mauritssilvis.patterns.java"
version = libs.versions.java.patterns.get()

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter.api)

    testRuntimeOnly(libs.junit.jupiter.engine)
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

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
