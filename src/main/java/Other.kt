object Other {
    object Android {
        object Coil {
            private const val group = "io.coil-kt"
            fun coil(ver: String = DYNAMIC_VERSION) = "$group:coil:$ver"
            fun compose_support(ver: String = DYNAMIC_VERSION) = "$group:coil-compose:$ver"
        }
        object Mapbox {
            object Maven {
                const val url = "https://api.mapbox.com/downloads/v2/releases/maven"
            }
            fun android(ver: String = DYNAMIC_VERSION) = "com.mapbox.maps:android:$ver"
            fun search_core(ver: String = DYNAMIC_VERSION) = "com.mapbox.search:mapbox-search-android:$ver"
            fun search_ui(ver: String = DYNAMIC_VERSION) = "com.mapbox.search:mapbox-search-android-ui:$ver"
        }
        object Tencent {
            object Bugly {
                fun crashreport(ver: String = DYNAMIC_VERSION) = "com.tencent.bugly:crashreport:$ver"
                fun nativecrashreport(ver: String = DYNAMIC_VERSION) = "com.tencent.bugly:nativecrashreport:$ver"
            }
            fun mmkv(ver: String = DYNAMIC_VERSION) = "com.tencent:mmkv:$ver"
        }
        fun AppUpdate(ver: String = DYNAMIC_VERSION) = "com.github.azhon:AppUpdate:$ver"
        object Spiderman {
            fun debug(ver: String = DYNAMIC_VERSION) = "com.github.simplepeng.SpiderMan:spiderman:$ver"
            const val exclude_group = "androidx.appcompat"
        }
        fun email(ver: String = DYNAMIC_VERSION) = "com.github.nedimf:maildroid:$ver"
        fun debug_db(ver: String = DYNAMIC_VERSION) = "com.amitshekhar.android:debug-db:$ver"
        fun leakcanary(ver: String = DYNAMIC_VERSION) = "com.squareup.leakcanary:leakcanary-android:$ver"
    }
}