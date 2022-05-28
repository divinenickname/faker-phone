plugins {
    idea
    kotlin("jvm") version Versions.KOTLIN
}

group = "ru.divinenickname.kotlin.faker.phone"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:${Versions.JUNIT}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:${Versions.JUNIT}")
    testImplementation("io.kotest:kotest-assertions-core-jvm:${Versions.KOTEST}")
}

tasks.withType<Test> {
    useJUnitPlatform()
}