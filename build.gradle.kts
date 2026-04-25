plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.6"
}

group = "spaceinvadersProject"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(fileTree("libs") {
        include("*.jar")
    })
    implementation("io.github.classgraph:classgraph:4.8.184")
}

tasks.shadowJar {
    archiveClassifier.set("")

    manifest {
        attributes["Main-Class"] = "spaceinvadersProject.MyGame"
    }
}

tasks.test {
    useJUnitPlatform()
}