plugins {
    id("com.github.talkback-foss-team.talkback-foss.shared")
}

android {
    compileSdkVersion = 32
    buildToolsVersion = "32.0.0"
    
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    defaultConfig {
        vectorDrawables {
            useSupportLibrary = true
        }
        multiDexEnabled = true
        minSdkVersion = 28
        targetSdkVersion = 31
    }
    flavorDimensions("target")
    productFlavors {
        phone {
            setDimension("target")
        }
        wear {
            setDimension("target")
        }
    }
    lintOptions {
    checkReleaseBuilds = false
        abortOnError = false
    }
}

dependencies {

    // Google common
    implementation("com.google.guava:guava:31.1-android")
    implementation("com.google.android.material:material:1.6.0")

    // Support library
    implementation("androidx.annotation:annotation:1.3.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.collection:collection:1.2.0")
    implementation("androidx.core:core:1.7.0")
    implementation("androidx.fragment:fragment:1.4.1")
    implementation("androidx.localbroadcastmanager:localbroadcastmanager:1.1.0")
    implementation("androidx.preference:preference:1.2.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    // Nullable
    implementation("org.checkerframework:checker-qual:3.22.0")

    // Auto-value
    api("com.google.auto.value:auto-value-annotations:1.9")
    annotationProcessor("com.google.auto.value:auto-value:1.9")
    implementation("javax.annotation:javax.annotation-api:1.3.2")

    wearCompileOnly("com.google.android.support:wearable:2.9.0")
    //wearCompileOnly("com.google.android.wearable:wearable:2.9.0")
}
