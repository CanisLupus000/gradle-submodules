plugins {
    id("java")
}

allprojects{
    repositories{
        mavenCentral()
    }
}

subprojects{
    apply(plugin = "java")
}