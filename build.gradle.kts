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

    dependencies{
        testImplementation(group="org.junit.jupiter", name="junit-jupiter", version="5.6.2")
    }
}