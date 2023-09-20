// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}
dependencies {
    implementation("androidx.constraintlayout:constraintlayout:2.2.0-alpha12")
    // To use constraintlayout in compose
    implementation("androidx.constraintlayout:constraintlayout-compose:1.1.0-alpha12")
}

fun implementation(s: String) {

}
