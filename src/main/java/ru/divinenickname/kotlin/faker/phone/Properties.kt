package ru.divinenickname.kotlin.faker.phone

data class Properties(
    val codes: Codes,
    val format: String,
    val normalizedFormat: List<String>,
)

data class Codes(
    val country: String,
    val trunk: String,
)
