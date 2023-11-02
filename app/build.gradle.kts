import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.9.0" apply true
    id("org.jetbrains.kotlin.kapt") apply false

}
/*val compileKotlin: KotlinCompile by tasks
val compileTestKotlin: KotlinCompile by tasks*/

android {
    namespace = "com.example.myapplication"
    compileSdk = 34
    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}


    dependencies {


        val room_version = "2.6.0"

        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")

        implementation("com.squareup.okhttp3:logging-interceptor:4.5.0")
        implementation("com.squareup.okhttp3:okhttp:4.11.0")
        testImplementation("com.squareup.okhttp3:mockwebserver:4.11.0")
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        /*implementation("com.android.support:appcompat-v7:23.0.0")
        implementation("com.android.support:design:23.1.1")*/
        implementation("androidx.navigation:navigation-fragment-ktx:2.7.4")
        implementation("androidx.navigation:navigation-ui-ktx:2.7.4")

        implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.20")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")

        /*kapt("androidx.room:room-compiler:$room_version")*/
        implementation("androidx.cardview:cardview:1.0.0")
        /*implementation(platform("com.squareup.okhttp3:okhttp-bom:4.11.0"))*/
        /*implementation("com.squareup.okhttp3:okhttp")*/
        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
        implementation("androidx.activity:activity-compose:1.8.0")
        implementation(platform("androidx.compose:compose-bom:2023.03.00"))
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.appcompat:appcompat:1.6.1")
        /*implementation("androidx.annotation:annotation:1.5.0")*/
        implementation("com.google.android.material:material:1.2.0-alpha10")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        testImplementation("junit:junit:4.13.2")
        /*androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")*/
    }
