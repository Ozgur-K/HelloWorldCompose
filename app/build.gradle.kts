plugins {
  id("com.android.application")
  kotlin("android")
  
id("org.jetbrains.kotlin.plugin.compose") version "2.1.21" // Add Compose plugin
}


android {
    namespace = "com.example.helloworldcompose"
    compileSdk = 35

signingConfigs {
        create("debug") {
            storeFile = file(System.getProperty("user.home") + "/.android/debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }
    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
            isMinifyEnabled = false
            isDebuggable = false
        }
    }


    defaultConfig {
        applicationId = "com.example.helloworldcompose"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = "21"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation("androidx.compose.ui:ui:1.5.3")
    implementation("androidx.compose.material3:material3:1.1.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.3")
    debugImplementation("androidx.compose.ui:ui-tooling:1.5.3")
}

