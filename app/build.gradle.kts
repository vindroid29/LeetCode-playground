plugins {
    alias(libs.plugins.kotlinjvm)
    id("application")
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("com.vindroid.leetcode.LC0001_TwoSumKt")
}

dependencies {
    testImplementation(libs.kotlintest)
}
