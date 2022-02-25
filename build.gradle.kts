plugins {
    `kotlin-dsl`
    id("maven-publish")
}

repositories {
    mavenCentral()
}

group = "com.github.D10NG"
version = "2.0"

publishing {
    publications {
        create("release", MavenPublication::class) {
            from(components.getByName("java"))
        }
    }
}