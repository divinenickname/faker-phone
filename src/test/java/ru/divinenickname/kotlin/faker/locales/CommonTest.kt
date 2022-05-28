package ru.divinenickname.kotlin.faker.locales

import com.google.i18n.phonenumbers.PhoneNumberUtil
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import ru.divinenickname.kotlin.faker.phone.Phone
import java.util.*

abstract class CommonTest(private val locale: Locale) {

    val util = PhoneNumberUtil.getInstance()

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

    @Test
    fun testInternationalViaGoogleLibrary() {
        val phone = Phone(locale)
        val languageTag = locale.toLanguageTag().uppercase()
        val proto = util.parse(phone.international, languageTag)
        val actual = util.isValidNumberForRegion(proto, languageTag)

        actual shouldBe true
    }
}
