dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "TalkBack FOSS"
include(
    ":app",
    ":talkback",
    ":compositor",
    ":utils",
    ":proguard",
    ":braille",
    ":brailleime"
)
