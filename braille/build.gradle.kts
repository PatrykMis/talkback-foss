plugins {
    id("com.android.library")
}

apply<Shared>()

android {
    namespace = "com.google.android.accessibility.braille.service"
    ndkVersion = "25.2.9519653"
    externalNativeBuild {
        ndkBuild {
            path(file("src/phone/jni/Android.mk"))
        }
    }
}

dependencies {
    implementation(project(":proguard"))
    implementation(project(":utils"))
}

tasks.register<Zip>("createTranslationTablesZip") {
    archiveFileName.set("translationtables.zip")
    destinationDirectory.set(file("src/phone/res/raw/"))
    from(fileTree("./src/phone/tables/"))
    into("liblouis/tables")
}

tasks.named("preBuild") { dependsOn("createTranslationTablesZip") }
