import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

private typealias AndroidBaseExtension = BaseExtension

internal fun Project.configureAndroid() = this.extensions.getByType<AndroidBaseExtension>().run {
    compileSdkVersion = "android-32"
    buildToolsVersion = "32.0.0"
    
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }

    defaultConfig {
        vectorDrawables {
            useSupportLibrary = true
        }
        multiDexEnabled = true
        minSdk = 28
        targetSdk = 31
    }
    flavorDimensions("target")
    productFlavors {
        create("phone") {
            dimension("target")
        }
        create("wear") {
            dimension("target")
        }
    }
    lintOptions {
    isCheckReleaseBuilds = false
        isAbortOnError = false
    }
}
