buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("org.aspectj:aspectjtools:1.9.9.1")
        classpath("com.android.tools.build:gradle:7.2.1")
    }
}

allprojects {
    ext {
        set("talkbackApplicationId", "com.android.talkbackfoss")
        set("talkbackMainPermission", "com.android.talkbackfoss.permission.TALKBACK")
    }
}
    