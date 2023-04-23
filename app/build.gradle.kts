import java.io.FileInputStream
import java.util.Properties

plugins {
    id("com.android.application")
}

apply<Shared>()

val keystorePropertiesFile = rootProject.file("keystore.properties")
val useKeystoreProperties = keystorePropertiesFile.canRead()
val keystoreProperties = Properties()
if (useKeystoreProperties) {
    keystoreProperties.load(FileInputStream(keystorePropertiesFile))
}

dependencies {
    implementation(project(":talkback"))
}

android {
    if (useKeystoreProperties) {
        signingConfigs {
            create("release") {
                keyAlias = keystoreProperties["keyAlias"] as String
                keyPassword = keystoreProperties["keyPassword"] as String
                storeFile = file(keystoreProperties["storeFile"]!!)
                storePassword = keystoreProperties["storePassword"] as String
                enableV2Signing = false
                enableV3Signing = true
                enableV4Signing = true
            }
        }
    }
    defaultConfig {
        applicationId = ConfigData.talkbackApplicationId
        namespace = ConfigData.talkbackApplicationId
        versionName = "12.1.0.397273158-f01"
        versionCode = 397273158
        manifestPlaceholders["talkbackMainPermission"] = ConfigData.talkbackMainPermission
        testInstrumentationRunner = "android.test.InstrumentationTestRunner"
        multiDexEnabled = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false // needs additional proguard-rules.pro configuration
            isShrinkResources = false // needs additional proguard-rules.pro configuration
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            if (useKeystoreProperties) {
                signingConfig = signingConfigs.getByName("release")
            }
        }
    }
}
