package ru.divinenickname.kotlin.faker.locales

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import ru.divinenickname.kotlin.faker.phone.Phone
import java.util.*

class RussianLocaleTest {

    @Test
    fun numberLengthTest() {
        val phone = Phone(Locale("ru"))

        phone.number.length shouldBe 10
    }

    @Test
    fun internationalNumberCodeTest() {
        val phone = Phone(Locale("ru"))
        val actual = phone.international

        actual.subSequence(0,2) shouldBe "+7"
    }

    @Test
    fun internationalNumberLengthTest() {
        val phone = Phone(Locale("ru"))
        val actual = phone.international

        actual.length shouldBe 12
    }

    @Test
    fun trunkNumberLengthTest() {
        val phone = Phone(Locale("ru"))
        val actual = phone.trunk

        actual.length shouldBe 11
    }

    @Test
    fun trunkNumberCodeTest() {
        val phone = Phone(Locale("ru"))
        val actual = phone.trunk

        actual.subSequence(0,1) shouldBe "8"
    }
}