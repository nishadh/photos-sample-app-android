import org.gradle.api.artifacts.dsl.DependencyHandler
object Testing {
    const val jUnit = "junit:junit:4.13"
    const val extJUnit = "androidx.test.ext:junit:1.1.1"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}

object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:1.4.30"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30"
    const val gradle = "com.android.tools.build:gradle:4.1.2"
    const val ktLint = "org.jlleitschuh.gradle:ktlint-gradle:9.2.1"
    const val materialDesign = "com.google.android.material:material:1.2.0"
    const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.3"
    const val daggerHilt = "com.google.dagger:hilt-android-gradle-plugin:2.32-alpha"
}

object Navigation {
    const val framework = "androidx.navigation:navigation-fragment-ktx:2.3.2"
    const val ui = "androidx.navigation:navigation-ui-ktx:2.3.2"
}

object Lifecycle {
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
}

object Coroutines {
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2"
}

object Android {
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val coreKtx = "androidx.core:core-ktx:1.3.2"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:4.12.0"
    const val compiler = "com.github.bumptech.glide:compiler:4.12.0"
}

object Hilt {
    const val daggerCompiler = "com.google.dagger:hilt-android-compiler:2.31-alpha"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0-alpha02"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02"
    const val hiltAndroid = "com.google.dagger:hilt-android:2.31-alpha"
}

object Room {
    const val compiler = "androidx.room:room-compiler:2.2.6"
    const val ktx = "androidx.room:room-ktx:2.2.6"
    const val runtime = "androidx.room:room-runtime:2.2.6"
}

object Moshi {
    const val moshi = "com.squareup.moshi:moshi-kotlin:1.11.0"
    const val codeGen = "com.squareup.moshi:moshi-kotlin-codegen:1.11.0"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val moshiRetrofitConverter = "com.squareup.retrofit2:converter-moshi:2.9.0"
}
