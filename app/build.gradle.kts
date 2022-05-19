plugins {
    id("com.android.application")
}

apply<Shared>()

dependencies {
    implementation(project(":talkback"))
}

android {
    defaultConfig {
        applicationId = ConfigData.talkbackApplicationId
        versionName = "12.1.0.397273158-f01"
        versionCode = 397273158
        manifestPlaceholders["talkbackMainPermission"] = ConfigData.talkbackMainPermission
        testInstrumentationRunner = "android.test.InstrumentationTestRunner"
        multiDexEnabled = true
    }
}
