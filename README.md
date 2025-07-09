<h1 align="center">CodeBuzz Android Project </h1>

<div align="center">

⚡️ [![GitHub](https://img.shields.io/github/license/ahemon369/Kinakata?color=black)](https://github.com/ahemon369/Kinakata/blob/main/LICENSE)
![GitHub stars](https://img.shields.io/github/stars/ahemon369/Kinakata)
![GitHub forks](https://img.shields.io/github/forks/ahemon369/Kinakata)

</div>

## 📋 <a name="table">Table of Contents</a>

🤖 [Introduction](#introduction)
⚙️ [Tech Stack](#tech-stack)
🔋 [Feature](#feature)
🤸 [Quick Start](#quick-start)
🚀 [Author](#authors)
📄 [License](#license)

## <a name="introduction">🤖 Introduction</a>

A CodeBuzz app of increament and dicreament function

## <a name="tech-stack">⚙️ Tech Stack</a>

  <div>
  <img src="https://img.shields.io/badge/-Andoid_Studio-black?style=for-the-badge&logoColor=white&logo=androidstudio&color=3DDC84" alt="Android Studio" />
  <img src="https://img.shields.io/badge/-Kotlin-black?style=for-the-badge&logoColor=white&logo=kotlin&color=7F52FF" alt="Kotlin" />
  <img src="https://img.shields.io/badge/-Android-black?style=for-the-badge&logoColor=white&logo=android&color=173B3F" alt="Kotlin" />
  </div> <br/>

## <a name="feature">🛒 Features Preview</a>

👉 Kinakata Software
👉 E-Commerce Project

✅ Product List View (RecyclerView)

➕➖ Quantity Increase/Decrease Button

🛍️ Add to Cart Functionality

🔍 Product Search

📦 Category Based Product Filter (Optional)

💳 Checkout UI (Basic)

## <a name="quick-start">🤸 Quick Start</a>

Follow these steps to set up the project locally on your machine.

**Prerequisites 📋**

You'll need [Git](https://git-scm.com) and [Android Studio](https://developer.android.com/studio).

---

**Cloning the Repository**

From your command line, first clone Simplefolio:

<!-- # Clone the repository -->

```bash
# Clone the repository
$ git clone https://github.com/ahemon369/Kinakata
```
```
Open it in Android Studio and it in a Android Emulator
```
**Used plugins This Project**
```
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    alias(libs.plugins.google.gms.google.services)
}
```
**Used dependencies This Project**

<!-- # Clone the repository -->

```bash
🧱 Core Libraries
implementation("androidx.lifecycle:lifecycle-extensions:2.2.0") // Lifecycle-aware components
implementation("androidx.lifecycle:lifecycle-common-java8:2.6.2")
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2") // ViewModel support with Kotlin coroutines

📱 UI & Design
implementation("com.intuit.sdp:sdp-android:1.1.0") // Scalable size units for UI
implementation("com.intuit.ssp:ssp-android:1.1.0") // Scalable text size units
implementation("com.facebook.shimmer:shimmer:0.5.0@aar") // Loading shimmer effect
implementation("com.github.denzcoskun:ImageSlideshow:0.1.2") // Image slider/carousel
📷 Image Loading
implementation("com.github.bumptech.glide:glide:4.16.0") // Efficient image loading and caching
annotationProcessor("com.github.bumptech.glide:compiler:4.15.0")
🧭 Navigation
implementation("androidx.navigation:navigation-fragment-ktx:2.7.6") // Fragment navigation support
implementation("androidx.navigation:navigation-ui-ktx:2.7.6") // UI navigation component
🔥 Firebase (via BoM)
implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
implementation("com.google.firebase:firebase-analytics") // Analytics
implementation("com.google.firebase:firebase-auth-ktx") // Authentication
implementation("com.google.firebase:firebase-storage-ktx") // Cloud Storage
implementation("com.google.firebase:firebase-database-ktx") // Realtime Database
implementation("com.google.firebase:firebase-messaging-ktx:23.4.0") // Push Notifications
📲 Google Services
implementation("com.google.android.gms:play-services-auth:20.7.0") // Google sign-in
implementation("com.google.android.gms:play-services-auth-api-phone:18.0.1") // Phone number OTP
🏪 Room Database (Local storage)
val room_version = "2.6.1"
implementation("androidx.room:room-runtime:$room_version")
annotationProcessor("androidx.room:room-compiler:$room_version")
kapt("androidx.room:room-compiler:$room_version")
implementation("androidx.room:room-ktx:$room_version") // Kotlin support
🌐 Networking (API calls)
implementation("com.squareup.retrofit2:retrofit:2.9.0") // REST client
implementation("com.squareup.retrofit2:converter-gson:2.9.0") // JSON to POJO conversion
💳 Payment Integration
implementation("com.razorpay:checkout:1.6.40") // Razorpay payment gateway

```

## <a name="authors"> Author </a>

<p align="center">
<!-- <a href="https://shahjabir.com.bd">
<img src="https://img.shields.io/badge/Website-ShahJabir-black" alt="Facebook" /></a> -->
<a href="https://github.com/ahemon369">
<img src="https://img.shields.io/badge/Github-ahemon369-white" alt="Github" /></a>
<a href="https://www.facebook.com/ahemon369">
<img src="https://img.shields.io/badge/Facebook-ahemon369-blue" alt="Facebook" /></a>
<!-- <a href="https://x.com/TaqiJabir">
<img src="https://img.shields.io/badge/X-TaqiJabir-black" alt="Twitter" /> -->
<a href="https://www.linkedin.com/in/amranemon">
<img src="https://img.shields.io/badge/Linkedin-amranemon-blue" alt="Linkedin" /></a>
</a>
</p>

## <a name="license">License 📄</a>

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/ahemon369/CodeBuzz/blob/main/LICENSE) file for details
