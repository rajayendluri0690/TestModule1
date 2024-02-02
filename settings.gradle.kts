pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TestModule"
include(":app")
include(":ModuleBottomNav")
project(":ModuleBottomNav").projectDir = File("$rootDir/ModuleBottomNav")
include(":resourcemodule")
