plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 31
    buildToolsVersion = "31.0.0"

    defaultConfig {
        applicationId = "com.foodyapp"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }

    composeOptions {
        kotlinCompilerVersion = "1.5.10"
        kotlinCompilerExtensionVersion = "1.0.0-rc02"
    }

    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
    }

}

dependencies {


    val kotlinVersion = "1.5.10"
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("androidx.core:core-ktx:1.6.0")

    val appCompat = "1.4.0-alpha03"
    implementation("androidx.appcompat:appcompat:$appCompat")

    val material = "1.4.0"
    implementation("com.google.android.material:material:$material")

    val constraintLayout = "2.0.4"
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayout")

    val androidxUi = "1.0.0-alpha07"
    implementation("androidx.ui:ui-tooling:$androidxUi")

    val compose = "1.0.0-rc02"
    implementation("androidx.compose.ui:ui:$compose")
    implementation("androidx.compose.foundation:foundation:$compose")
    implementation("androidx.compose.runtime:runtime-livedata:$compose")
    implementation("androidx.compose.material:material:$compose")
    implementation("androidx.compose.material:material-icons-core:$compose")
    implementation("androidx.compose.material:material-icons-extended:$compose")

    val composeConstraint = "1.0.0-alpha08"
    implementation("androidx.constraintlayout:constraintlayout-compose:$composeConstraint")

    val composeActivity = "1.3.0-rc01"
    implementation("androidx.activity:activity-compose:$composeActivity")

}