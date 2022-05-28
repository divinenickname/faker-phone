package ru.divinenickname.kotlin.faker.locales

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import ru.divinenickname.kotlin.faker.phone.Phone
import java.util.*

abstract class CommonTest(private val locale: Locale) {

    @Test
    abstract fun numberLengthTest()
    fun numberLengthTest(phoneLength: Short) {
        val phone = Phone(locale)

        phone.number.length shouldBe phoneLength
    }


    @Test
    abstract fun internationalNumberCodeTest()
    fun internationalNumberCodeTest(prefix: String) {
        val phone = Phone(locale)

        phone.international.subSequence(0, prefix.length) shouldBe prefix
    }

    @Test
    abstract fun internationalNumberLengthTest()
    fun internationalNumberLengthTest(phoneLength: Short) {
        val phone = Phone(locale)

        phone.international.length shouldBe phoneLength
    }

    @Test
    abstract fun trunkNumberLengthTest()
    fun trunkNumberLengthTest(phoneLength: Short) {
        val phone = Phone(locale)

        phone.trunk.length shouldBe phoneLength
    }

    @Test
    abstract fun trunkNumberCodeTest()
    fun trunkNumberCodeTest(prefix: String) {
        val phone = Phone(locale)

        phone.trunk.subSequence(0, prefix.length) shouldBe prefix
    }
}
