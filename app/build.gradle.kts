plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.speedmonitordemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.speedmonitordemo"
        minSdk = 21  // You can set this based on your target
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // AndroidX libraries
    implementation(libs.androidx.core-ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // Lifecycle libraries (for MVVM architecture)
    implementation(libs.lifecycle-viewmodel-ktx)
    implementation(libs.lifecycle-livedata-ktx)

    // Coroutines
    implementation(libs.coroutines)

    // Firebase (For Mock/Real Notification handling)
    implementation(libs.firebase)
    implementation(libs.firebase.messaging.ktx)

    // Unit testing dependencies
    testImplementation(libs.junit)

    // Android test dependencies
    androidTestImplementation(libs.androidx-junit)
    androidTestImplementation(libs.androidx-espresso-core)

    // Mockito for mocking in unit tests
    testImplementation(libs.mockito-core)

    // Additional dependencies if necessary
    // implementation(libs.retrofit)  // If you intend to use Retrofit for any network calls
}

