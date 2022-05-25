plugins {
    idea
    kotlin("jvm") version "1.6.21"
}

group = "ru.divinenickname.kotlin.faker.phone"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
}

tasks.test {
    useJUnitPlatform()
}