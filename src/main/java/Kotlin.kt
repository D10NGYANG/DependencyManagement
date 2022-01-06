object Kotlin {
    const val version = "1.5.31"
    object Classpath {
        const val gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:$version"
    }
    object Plugin {
        object ID {
            const val android = "kotlin-android"
            const val kapt = "kotlin-kapt"
            const val parcelize = "kotlin-parcelize"
            const val serialization = "kotlinx-serialization"
        }
        object Kotlin {
            const val jvm = "jvm"
            const val stdlib = "stdlib"
            const val reflect = "reflect"
            const val kapt = "kapt"
        }
    }
    const val jvm_target_1_8 = "1.8"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
    object Coroutines {
        const val coroutines_version = "1.5.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version"
    }
    object Serialization {
        const val serialization_version = "1.3.2"
        const val json = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization_version"
    }
    object Ktor {
        const val ktor_version = "1.6.7"
        const val core = "io.ktor:ktor-client-core:$ktor_version"
        const val cio = "io.ktor:ktor-client-cio:$ktor_version"
        const val apache = "io.ktor:ktor-client-apache:$ktor_version"
        const val java = "io.ktor:ktor-client-java:$ktor_version"
        const val jetty = "io.ktor:ktor-client-jetty:$ktor_version"
        const val android = "io.ktor:ktor-client-android:$ktor_version"
        const val okhttp = "io.ktor:ktor-client-okhttp:$ktor_version"
        const val js = "io.ktor:ktor-client-js:$ktor_version"
        const val ios = "io.ktor:ktor-client-ios:$ktor_version"
        const val curl = "io.ktor:ktor-client-curl:$ktor_version"
        const val logging = "io.ktor:ktor-client-logging:$ktor_version"
        const val logback = "ch.qos.logback:logback-classic:1.2.10"
        const val serialization = "io.ktor:ktor-client-serialization:$ktor_version"
    }
}