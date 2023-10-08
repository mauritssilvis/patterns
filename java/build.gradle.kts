/*
 * Copyright © 2022, 2023 Maurits Silvis
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

plugins {
    `java-library`
}

group = "nl.mauritssilvis.patterns.java"
version = libs.versions.java.patterns.get()

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter.api)

    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.jdk.get()))
        // TODO: Reset to JvmVendorSpec.ADOPTIUM
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

tasks {
    test {
        useJUnitPlatform()
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
