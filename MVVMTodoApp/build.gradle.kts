// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        // Agrega la dependencia del plugin de Dagger Hilt
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
    }
}

plugins {
    kotlin("android") version "1.9.0"
    kotlin("kapt") version "1.9.0"
    id("com.android.application") version "8.2.0"
    id("dagger.hilt.android.plugin") version "2.38.1"
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
