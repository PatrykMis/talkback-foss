plugins {
    id("com.android.library")
}

apply<Shared>()

dependencies {
    implementation(project(":utils"))
    implementation(project(":braille"))
}
