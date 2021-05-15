
plugins {
    base
    kotlin("jvm") version "1.5.0"
}

allprojects {
    group = "me.sumit.uptime"
    version = "1.0"
    repositories {
        mavenCentral()
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        api(it)
    }
}
