plugins {
    alias(libs.plugins.image.toolbox.library)
    alias(libs.plugins.image.toolbox.compose)
    id("maven-publish")
}
afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["release"])
            }
        }
    }
}

android.namespace = "com.smarttoolfactory.beforeafter"

dependencies {
    implementation(projects.libs.gesture)

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.runtime)
    implementation(libs.compose.material3)
    implementation(libs.compose.material.iconsExtended)
}