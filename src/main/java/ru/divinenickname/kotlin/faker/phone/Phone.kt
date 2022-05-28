package ru.divinenickname.kotlin.faker.phone

import ru.divinenickname.kotlin.faker.core.ObjectMapperYaml
import java.io.File
import java.util.*

class Phone(
    locale: Locale,
) {
    private val objectMapper = ObjectMapperYaml()
    private val file = File(this.javaClass.getResource("/locales/${locale.language}.yaml").path)
    private val properties = objectMapper.readValue(file, Properties::class.java)

    val number = Number(properties.normalizedFormat).number
    val international = "${properties.codes.country}$number"
    val trunk = "${properties.codes.trunk}$number"
}