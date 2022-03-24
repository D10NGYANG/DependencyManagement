val DYNAMIC_VERSION = "+"

object D10NG {
    private const val group = "com.github.D10NGYANG"
    fun DLAppUtil(ver: String = DYNAMIC_VERSION) = "$group:DLAppUtil:$ver"
    fun DLCoroutinesUtil(ver: String = DYNAMIC_VERSION) = "$group:DLCoroutinesUtil:$ver"
    fun DLDateUtil(ver: String = DYNAMIC_VERSION) = "$group:DLDateUtil:$ver"
    // 正在抛弃，替换成 DLTextUtil
    fun DLStringUtil(ver: String = DYNAMIC_VERSION) = "$group:DLStringUtil:$ver"
    fun DLTextUtil(ver: String = DYNAMIC_VERSION) = "$group:DLTextUtil:$ver"
    fun DLGpsUtil(ver: String = DYNAMIC_VERSION) = "$group:DLGpsUtil:$ver"
    fun DLLatLngUtil(ver: String = DYNAMIC_VERSION) = "$group:DLLatLngUtil:$ver"
    fun DL10RetrofitCoroutines(ver: String = DYNAMIC_VERSION) = "$group:DL10RetrofitCoroutines:$ver"
    fun DLMoshiUtil(ver: String = DYNAMIC_VERSION) = "$group:DLMoshiUtil:$ver"
    fun DLSideBar_Compose(ver: String = DYNAMIC_VERSION) = "$group:DLSideBar_Compose:$ver"
    fun DLBasicJetpackComposeApp(ver: String = DYNAMIC_VERSION) = "$group:DLBasicJetpackComposeApp:$ver"
    fun NetworkDebugAssistant(ver: String = DYNAMIC_VERSION) = "$group:NetworkDebugAssistant:$ver"
    fun DLQRCodeUtil(ver: String = DYNAMIC_VERSION) = "$group:DLQRCodeUtil:$ver"
}

