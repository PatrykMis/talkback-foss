import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        apiVersion = "1.6"
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation("com.android.tools.build:gradle-api:7.2.0")
    gradleApi()
    implementation("com.android.tools.build:gradle:7.2.0")
}
