package ru.divinenickname.kotlin.faker.phone

import ru.divinenickname.kotlin.faker.core.ObjectMapperYaml
import java.io.File
import java.util.*

class Phone(
    private val locale: Locale,
) {
    private val objectMapper = ObjectMapperYaml()
    val a = locale.isO3Country
    private val file = File(this.javaClass.getResource("/locales/ru_RU.yaml").path)
    private val properties = objectMapper.readValue(file, Properties::class.java)

    val number = Number(properties.format).number
    val international = "${properties.codes.country}$number"
    val trunk = "${properties.codes.trunk}$number"
}