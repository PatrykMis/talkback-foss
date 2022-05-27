plugins {
    id("com.android.library")
}

apply<Shared>()

android {
    ndkVersion = "23.1.7779620"
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

afterEvaluate {
    tasks.named("preBuild") {
        dependsOn("createTranslationTablesZip")
    }
}
