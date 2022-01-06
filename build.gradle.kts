plugins {
    `kotlin-dsl`
    id("maven-publish")
}

repositories {
    mavenCentral()
}

group = "com.github.D10NG"
version = "1.0-SNAPSHOT"

publishing {
    publications {
        create("release", MavenPublication::class) {
            from(components.getByName("java"))
        }
    }
}