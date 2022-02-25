object Kotlin {
    object Plugin {
        object ID {
            const val android = "org.jetbrains.kotlin.android"
            const val kapt = "org.jetbrains.kotlin.kapt"
            const val parcelize = "org.jetbrains.kotlin.plugin.parcelize"
            const val serialization = "org.jetbrains.kotlin.plugin.serialization"
        }
        object Kotlin {
            const val jvm = "jvm"
            const val stdlib = "stdlib"
            const val reflect = "reflect"
            const val kapt = "kapt"
        }
    }
    fun stdlib(ver: String = DYNAMIC_VERSION) = "org.jetbrains.kotlin:kotlin-stdlib:$ver"
    fun reflect(ver: String = DYNAMIC_VERSION) = "org.jetbrains.kotlin:kotlin-reflect:$ver"
    object Coroutines {
        fun core(ver: String = DYNAMIC_VERSION) = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$ver"
        fun android(ver: String = DYNAMIC_VERSION) = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$ver"
    }
    object Serialization {
        fun json(ver: String = DYNAMIC_VERSION) = "org.jetbrains.kotlinx:kotlinx-serialization-json:$ver"
    }
    object Ktor {
        object Client {
            fun core(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-core:$ver"
            fun cio(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-cio:$ver"
            fun apache(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-apache:$ver"
            fun java(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-java:$ver"
            fun jetty(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-jetty:$ver"
            fun android(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-android:$ver"
            fun okhttp(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-okhttp:$ver"
            fun js(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-js:$ver"
            fun ios(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-ios:$ver"
            fun curl(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-curl:$ver"
            fun logging(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-logging:$ver"
            fun logback_classic(ver: String = DYNAMIC_VERSION) = "ch.qos.logback:logback-classic:$ver"
            fun serialization(ver: String = DYNAMIC_VERSION) = "io.ktor:ktor-client-serialization:$ver"
        }
    }
}