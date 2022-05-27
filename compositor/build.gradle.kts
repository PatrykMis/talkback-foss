plugins {
    id("com.android.library")
}

apply<Shared>()

dependencies {
    implementation(project(":proguard"))
    implementation(project(":utils"))
}
