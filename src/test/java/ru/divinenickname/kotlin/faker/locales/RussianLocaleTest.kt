package ru.divinenickname.kotlin.faker.locales

import org.junit.jupiter.api.Test
import ru.divinenickname.kotlin.faker.core.ObjectMapperYaml
import ru.divinenickname.kotlin.faker.phone.Phone
import ru.divinenickname.kotlin.faker.phone.Properties
import java.io.File
import java.util.*

class RussianLocaleTest {

    @Test
    fun a() {
        val a = Phone(Locale("ru"))
        println()
    }
}