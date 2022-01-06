# DependencyManagement
依赖管理
[![](https://jitpack.io/v/D10NGYANG/DependencyManagement.svg)](https://jitpack.io/#D10NGYANG/DependencyManagement)
# 使用
在`buildSrc`文件夹下的`build.gradle.ktx`文件中添加依赖。
```kotlin
plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.D10NGYANG:DependencyManagement:1.0")
}
```
