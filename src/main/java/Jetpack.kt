object Jetpack {
    object Datastore {
        const val version = "1.0.0"
        object Typed {
            const val datastore = "androidx.datastore:datastore:$version"
            const val core = "androidx.datastore:datastore-core:$version"
        }
        object Preferences {
            const val datastore = "androidx.datastore:datastore-preferences:$version"
            const val core = "androidx.datastore:datastore-preferences-core:$version"
        }
    }
    object Paging {
        const val version = "3.1.0"
        const val runtime = "androidx.paging:paging-runtime:$version"
        const val test = "androidx.paging:paging-common:$version"
        const val compose_support = "androidx.paging:paging-compose:1.0.0-alpha14"
    }
    object Room {
        const val version = "2.4.0"
        const val runtime = "androidx.room:room-runtime:$version"
        const val compiler = "androidx.room:room-compiler:$version"
        const val ktx_support = "androidx.room:room-ktx:$version"
        const val paging_support = "androidx.room:room-paging:$version"
        const val test = "androidx.room:room-testing:$version"
    }
    object Lifecycle {
        const val version = "2.4.0"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
        const val compiler = "androidx.lifecycle:lifecycle-common-java8:$version"
        const val viewmodel_support = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val compose_viewmodel_support = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
        const val savedstate_viewmodel_support = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$version"
        const val livedata_support = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        const val service_support = "androidx.lifecycle:lifecycle-service:$version"
        const val process_support = "androidx.lifecycle:lifecycle-process:$version"
        const val test = "androidx.arch.core:core-testing:2.1.0"
    }
}