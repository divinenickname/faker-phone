package ru.divinenickname.kotlin.faker.phone

data class Properties(
    val codes: Codes,
    val format: String,
    val normalizedFormat: String,
)

data class Codes(
    val country: String,
    val trunk: String,
)
