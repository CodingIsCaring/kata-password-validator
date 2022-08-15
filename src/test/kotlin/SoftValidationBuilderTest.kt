import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class SoftValidationBuilderTest {

    private fun buildASoftValidation(): Validation {
        return ValidationBuilder()
            .withMinimumNumberOfCharacters(7)
            .withUpperCase()
            .withLowerCase()
            .withDigits()
            .build()
    }

    @Test
    fun `should be invalid if it has less than 7 characters`() {
        assertFalse(buildASoftValidation().validate("wrong"))
    }

    @Test
    fun `should be valid`() {
        assertTrue(buildASoftValidation().validate("P4ssWord"))
    }

    @Test
    fun `should be invalid if it does not contain a number`() {
        assertFalse(buildASoftValidation().validate("Password"))
    }

    @Test
    fun `should be invalid if it does not contain a capital letter`() {
        assertFalse(buildASoftValidation().validate("p4ssword"))
    }

    @Test
    fun `should be invalid if it does not contain a lower case letter`() {
        assertFalse(buildASoftValidation().validate("P4SSWORD"))
    }

}