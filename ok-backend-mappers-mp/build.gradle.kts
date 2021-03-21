plugins {
    kotlin("jvm")
}

group = rootProject.group
version = rootProject.version

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":ok-backend"))
    implementation(project(":ok-transport-main-mp"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}
