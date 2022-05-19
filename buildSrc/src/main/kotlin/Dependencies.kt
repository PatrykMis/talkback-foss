import com.android.build.gradle.api.AndroidBasePlugin
import org.gradle.api.Project

// Google common
const val Guava = "com.google.guava:guava:31.1-android"
const val Material = "com.google.android.material:material:1.6.0"

// Support library
const val AndroidxAnnotation = "androidx.annotation:annotation:1.3.0"
const val AndroidxAppcompat = "androidx.appcompat:appcompat:1.4.1"
const val AndroidxCollection = "androidx.collection:collection:1.2.0"
const val AndroidxCore = "androidx.core:core:1.7.0"
const val AndroidxFragment = "androidx.fragment:fragment:1.4.1"
const val AndroidxLocalbroadcastmanager = "androidx.localbroadcastmanager:localbroadcastmanager:1.1.0"
const val AndroidxPreference = "androidx.preference:preference:1.2.0"
const val AndroidxRecyclerview = "androidx.recyclerview:recyclerview:1.2.1"
const val AndroidxViewpager2 = "androidx.viewpager2:viewpager2:1.0.0"

    // Nullable
const val checkerFramework = "org.checkerframework:checker-qual:3.22.0"

// Auto-value
const val AutovalueAnnotations = "com.google.auto.value:auto-value-annotations:1.9"
const val Autovalue = "com.google.auto.value:auto-value:1.9"
const val JavaxAnnotation = "javax.annotation:javax.annotation-api:1.3.2"

const val Wearable = "com.google.android.support:wearable:2.9.0"
    //wearCompileOnly("com.google.android.wearable:wearable:2.9.0")

internal fun Project.configureDependencies() = dependencies.apply {
    add("implementation", Guava)
        add("implementation", Material)
            add("implementation", AndroidxAnnotation)
    add("implementation", AndroidxAppcompat)
    add("implementation", AndroidxCollection)
    add("implementation", AndroidxCore)
    add("implementation", AndroidxFragment)
    add("implementation", AndroidxLocalbroadcastmanager)
    add("implementation", AndroidxPreference)
    add("implementation", AndroidxRecyclerview)
    add("implementation", AndroidxViewpager2)
    add("implementation", checkerFramework)
    add("api", AutovalueAnnotations)
    add("annotationProcessor", Autovalue)
    add("implementation", JavaxAnnotation)
    add("wearCompileOnly", Wearable)
}
