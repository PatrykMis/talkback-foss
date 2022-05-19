plugins {
    id("com.android.library")
}

apply<Shared>()

dependencies {
    implementation(project(":proguard"))
}

android {
    defaultConfig {
        buildConfigField("String", "TALKBACK_APPLICATION_ID", '"' + ConfigData.talkbackApplicationId + '"')
    }
}
