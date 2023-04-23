plugins {
    id("com.android.library")
}

apply<Shared>()

android {
    namespace = "com.google.android.accessibility.utils"
}

dependencies {
    implementation(project(":proguard"))
}

android {
    defaultConfig {
        buildConfigField("String", "TALKBACK_APPLICATION_ID", '"' + ConfigData.talkbackApplicationId + '"')
    }
}
