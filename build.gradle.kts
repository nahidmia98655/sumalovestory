// Root-level Gradle build script
// This file defines repositories for all modules and applies the Android/Kotlin plugins.

plugins {
    // Android application plugin (applied in module build files)
    id("com.android.application") version "8.2.0" apply false
    // Kotlin Android plugin (applied in module build files)
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}

repositories {
    google()
    mavenCentral()
}

// Optional: define a clean task for convenience
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
