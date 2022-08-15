import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class StrongValidationBuilderTest {

    private fun buildAStrongValidation(): Validation {
        return ValidationBuilder()
            .withMinimumNumberOfCharacters(17)
            .withUpperCase()
            .withLowerCase()
            .withUnderscore()
            .build()
    }

    @Test
    fun `should be invalid if it has less than 17 characters`() {
        assertFalse(buildAStrongValidation().validate("wrong"))
    }

    @Test
    fun `should be valid`() {
        assertTrue(buildAStrongValidation().validate("P_ssWordP_ssWord_"))
    }

    @Test
    fun `should be invalid if it does not contain an underscore`() {
        assertFalse(buildAStrongValidation().validate("PasswordPasswordPassword"))
    }

    @Test
    fun `should be invalid if it does not contain a capital letter`() {
        assertFalse(buildAStrongValidation().validate("p_sswordpasswordpassword"))
    }

    @Test
    fun `should be invalid if it does not contain a lower case letter`() {
        assertFalse(buildAStrongValidation().validate("P_SSWORDP_SSWORDP_SSWORD"))
    }

}