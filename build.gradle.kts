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
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.3.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}