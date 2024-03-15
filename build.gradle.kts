plugins {
    kotlin("jvm") version "1.9.22"
    id("com.github.weave-mc.weave-gradle") version "master-SNAPSHOT"
}

group = "gang.squad.fam.gang.mega.team"
version = "1.0.0"

minecraft.version("1.8.9")

repositories {
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("com.github.weave-mc:weave-loader:legacy-SNAPSHOT")
}

kotlin {
    jvmToolchain(17)
}