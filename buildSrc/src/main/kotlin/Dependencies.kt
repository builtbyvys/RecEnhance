package build

object Versions {
    const val kotlin = "1.8.0"
    const val kotlinCoroutines = "1.6.4"
    const val ktor = "2.2.4"
    const val serialization = "1.4.1"
    const val sqldelight = "1.5.5"
}

object Dependencies {
    // Kotlin
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib"
    const val kotlinStdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect"
    const val kotlinTestCommon = "org.jetbrains.kotlin:kotlin-test-common"
    const val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit"
    const val kotlinxSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1"
    const val kotlinxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
    const val kotlinxCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
    const val kotlinxCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"

    // Networking
    const val ktorClientCore = "io.ktor:ktor-client-core:2.2.4"
    const val ktorClientAndroid = "io.ktor:ktor-client-android:2.2.4"
    const val ktorClientIos = "io.ktor:ktor-client-ios:2.2.4"
    const val ktorClientSerialization = "io.ktor:ktor-client-serialization-json:2.2.4"
    const val ktorClientLogging = "io.ktor:ktor-client-logging:2.2.4"
    const val ktorSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1"

    // Database
    const val sqldelightRuntime = "com.squareup.sqldelight:runtime:1.5.5"
    const val sqldelightAndroidDriver = "com.squareup.sqldelight:android-driver:1.5.5"
    const val sqldelightNativeDriver = "com.squareup.sqldelight:native-driver:1.5.5"

    // Android Dependencies
    const val androidCoreKtx = "androidx.core:core-ktx:1.9.0"
    const val appCompat = "androidx.appcompat:appcompat:1.5.1"
    const val material = "com.google.android.material:material:1.8.0"
    const val androidConstraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val androidLifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.2"
    const val androidActivityKtx = "androidx.activity:activity-ktx:1.7.2"
    
    // Testing
    const val junit = "junit:junit:4.13.2"
    const val mockk = "io.mockk:mockk:1.13.5"

    // Android Testing
    const val androidTestExtJunit = "androidx.test.ext:junit:1.1.5"
    const val androidEspressoCore = "androidx.test.espresso:espresso-core:3.5.1"

}