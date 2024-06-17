dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(":shared", ":android", ":ios", ":windows", ":linux")

rootProject.name = "multiplatform-project"

include(":shared")