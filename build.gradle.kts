plugins {
    kotlin("jvm") version "1.9.23"
    `maven-publish`
}

group = "io.github.shiniseong.bridge-api"
version = "1.0.5"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("reflect"))
    implementation("com.fasterxml.jackson.core:jackson-core:2.17.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.17.1")
    testImplementation("io.kotest:kotest-runner-junit5:5.9.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}