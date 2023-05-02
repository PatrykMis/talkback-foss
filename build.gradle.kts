buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("org.aspectj:aspectjtools:1.9.19")
        classpath("com.android.tools.build:gradle:8.0.1")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
