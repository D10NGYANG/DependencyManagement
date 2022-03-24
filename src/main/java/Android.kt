object Android {
    object Plugin {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }
    object Google {
        fun material(ver: String = DYNAMIC_VERSION) = "com.google.android.material:material:$ver"
    }
    object Tools {
        fun desugar_jdk_libs_coreLibraryDesugaring(ver: String = DYNAMIC_VERSION) = "com.android.tools:desugar_jdk_libs:$ver"
    }
}

object AndroidX {
    object Test {
        fun junit(ver: String = DYNAMIC_VERSION) = "androidx.test.ext:junit:$ver"
        fun espresso_core(ver: String = DYNAMIC_VERSION) = "androidx.test.espresso:espresso-core:$ver"
    }
    fun core_ktx(ver: String = DYNAMIC_VERSION) = "androidx.core:core-ktx:$ver"
    fun appcompat(ver: String = DYNAMIC_VERSION) = "androidx.appcompat:appcompat:$ver"
    object Compose {
        fun ui(ver: String = DYNAMIC_VERSION) = "androidx.compose.ui:ui:$ver"
        fun ui_test(ver: String = DYNAMIC_VERSION) = "androidx.compose.ui:ui-test-junit4:$ver"
        fun ui_tooling(ver: String = DYNAMIC_VERSION) = "androidx.compose.ui:ui-tooling:$ver"
        fun foundation(ver: String = DYNAMIC_VERSION) = "androidx.compose.foundation:foundation:$ver"
        fun animation(ver: String = DYNAMIC_VERSION) = "androidx.compose.animation:animation:$ver"
        fun material(ver: String = DYNAMIC_VERSION) = "androidx.compose.material:material:$ver"
        fun material_icons_core(ver: String = DYNAMIC_VERSION) = "androidx.compose.material:material-icons-core:$ver"
        fun material_icons_extended(ver: String = DYNAMIC_VERSION) = "androidx.compose.material:material-icons-extended:$ver"
        fun runtime_livedata(ver: String = DYNAMIC_VERSION) = "androidx.compose.runtime:runtime-livedata:$ver"
    }
    fun navigation_compose(ver: String = DYNAMIC_VERSION) = "androidx.navigation:navigation-compose:$ver"
    fun activity_compose(ver: String = DYNAMIC_VERSION) = "androidx.activity:activity-compose:$ver"
    fun constraintlayout_compose(ver: String = DYNAMIC_VERSION) = "androidx.constraintlayout:constraintlayout-compose:$ver"

    object Datastore {
        fun datastore(ver: String = DYNAMIC_VERSION) = "androidx.datastore:datastore:$ver"
        fun datastore_core(ver: String = DYNAMIC_VERSION) = "androidx.datastore:datastore-core:$ver"
        fun datastore_preferences(ver: String = DYNAMIC_VERSION) = "androidx.datastore:datastore-preferences:$ver"
        fun datastore_preferences_core(ver: String = DYNAMIC_VERSION) = "androidx.datastore:datastore-preferences-core:$ver"
    }
    object Paging {
        fun runtime(ver: String = DYNAMIC_VERSION) = "androidx.paging:paging-runtime:$ver"
        fun common(ver: String = DYNAMIC_VERSION) = "androidx.paging:paging-common:$ver"
        fun compose_support(ver: String = DYNAMIC_VERSION) = "androidx.paging:paging-compose:$ver"
    }
    object Room {
        fun runtime(ver: String = DYNAMIC_VERSION) = "androidx.room:room-runtime:$ver"
        fun compiler(ver: String = DYNAMIC_VERSION) = "androidx.room:room-compiler:$ver"
        fun ktx_support(ver: String = DYNAMIC_VERSION) = "androidx.room:room-ktx:$ver"
        fun paging_support(ver: String = DYNAMIC_VERSION) = "androidx.room:room-paging:$ver"
        fun testing(ver: String = DYNAMIC_VERSION) = "androidx.room:room-testing:$ver"
    }
    object Lifecycle {
        fun runtime_ktx(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-runtime-ktx:$ver"
        fun common_java8(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-common-java8:$ver"
        fun viewmodel_ktx_support(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-viewmodel-ktx:$ver"
        fun viewmodel_compose_support(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-viewmodel-compose:$ver"
        fun viewmodel_savedstate_support(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$ver"
        fun livedata_ktx_support(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-livedata-ktx:$ver"
        fun service_support(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-service:$ver"
        fun process_support(ver: String = DYNAMIC_VERSION) = "androidx.lifecycle:lifecycle-process:$ver"
    }
}