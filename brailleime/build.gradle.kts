plugins {
    id("com.android.library")
}

apply<Shared>()

android {
    namespace = "com.google.android.accessibility.brailleime"
}

dependencies {
    implementation(project(":utils"))
    implementation(project(":braille"))
}
