@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        includeBuild("build-logic")
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
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "ImageToolboxLibs"

include(":libs:cropper")
include(":libs:dynamic-theme")
include(":libs:colordetector")
include(":libs:gesture")
include(":libs:beforeafter")
include(":libs:image")
include(":libs:screenshot")
include(":libs:modalsheet")
include(":libs:gpuimage")
include(":libs:colorpicker")
include(":libs:systemuicontroller")
include(":libs:placeholder")
include(":libs:logger")
include(":libs:zoomable")
include(":libs:extendedcolors")
include(":libs:androidwm")