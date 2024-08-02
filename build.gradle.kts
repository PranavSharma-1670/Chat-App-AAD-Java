

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.chatapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.chatapp"
        minSdk = 24
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //noinspection GradleCompatible
    implementation("com.android.support:support-V4:27.1.1")
    //for authentication purpose
    implementation("com.google.firebase:firebase-auth:19.3.0")
    //for database purpose
    implementation("com.google.firebase:firebase-database:19.2.1")
    implementation("com.google.firebase:firebase-core:17.2.3")
    //for maintenance purpose
    implementation("com.google.firebase:firebase-analytics:17.2.3")
    //for storing data purpose like images
    implementation("com.google.firebase:firebase-storage:19.1.1")
    //for Designing edittext
    implementation("com.rengwuxian.materialedittext:library:2.1.4")
    //for general designing
    implementation("com.google.android.material:material:1.2.0-alpha05")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("de.hdodenhof:circleimageview:2.2.0")
    implementation("com.github.bumptech.glide:glide:4.8.0")
    //for parsing data purpose(we are adding few libraries in advance to avoid wasting time)
    implementation("com.squareup.retrofit2:retrofit:2.3.0")
    implementation("com.squareup.retrofit2:converter-gson:2.3.0")
    implementation("com.google.firebase:firebase-messaging:20.1.2")



}