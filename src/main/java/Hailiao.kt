object Hailiao {
    object Beidou {
        fun core(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDCore:$ver"
        fun compiler(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDCompiler:$ver"
        fun bdproto2p1(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDProto2p1:$ver"
        fun bdprotohl(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDProtoHL:$ver"
        fun bdprotogw(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDProtoGW:$ver"
        fun smcore(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDSMCore:$ver"
        fun smcompiler(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDSMCompiler:$ver"
        fun smprotoeim(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDSMProtoEIM:$ver"
        fun smprotodts(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BDSMProtoDTS:$ver"
        fun bluetoothlib(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:BluetoothLib:$ver"
        fun serialportlib(ver: String = DYNAMIC_VERSION) = "com.hailiao.beidou:SerialPortLib:$ver"
    }
    object Maven {
        const val username = "ydl"
        const val password = "hailiao123"
        const val url_release = "https://nexus.bds100.com/repository/maven-releases/"
        const val username_down = "devops"
        const val password_down = "devops@"
    }
}