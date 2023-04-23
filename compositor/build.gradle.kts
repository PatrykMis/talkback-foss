plugins {
    id("com.android.library")
}

apply<Shared>()

android {
    namespace = "com.google.android.accessibility.compositor"
}

dependencies {
    implementation(project(":proguard"))
    implementation(project(":utils"))
}
