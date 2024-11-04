plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.dicoding.picodiploma.mycamera"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dicoding.picodiploma.mycamera"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
        mlModelBinding = true
    }
}

dependencies {
    val coreKtxVersion = "1.15.0"
    val appCompatVersion = "1.7.0"
    val materialVersion = "1.12.0"
    val constraintLayoutVersion = "2.2.0"
    val cameraXVersion = "1.4.0"
    val mlKitVersion = "16.0.1"
    val translateVersion = "17.0.3"
    val barcodeVersion = "18.3.1"
    val cameraMlKitVersion = "1.4.0"

    implementation("androidx.core:core-ktx:$coreKtxVersion")
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    implementation("com.google.android.material:material:$materialVersion")
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")

    implementation("androidx.camera:camera-camera2:$cameraXVersion")
    implementation("androidx.camera:camera-lifecycle:$cameraXVersion")
    implementation("androidx.camera:camera-view:$cameraXVersion")

    implementation("com.google.mlkit:text-recognition:$mlKitVersion")
    implementation("com.google.mlkit:translate:$translateVersion")

    implementation("com.google.android.gms:play-services-mlkit-barcode-scanning:$barcodeVersion")
    implementation("androidx.camera:camera-mlkit-vision:$cameraMlKitVersion")

    implementation("org.tensorflow:tensorflow-lite-metadata:0.4.4")
    implementation("org.tensorflow:tensorflow-lite:2.13.0")

    implementation("com.google.android.gms:play-services-tflite-support:16.1.0")
    implementation("com.google.android.gms:play-services-tflite-gpu:16.2.0")
    implementation("org.tensorflow:tensorflow-lite-task-vision-play-services:0.4.2")
    implementation("org.tensorflow:tensorflow-lite-gpu:2.9.0")
}