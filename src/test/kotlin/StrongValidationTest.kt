import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class StrongValidationTest {

    @Test
    fun `should be invalid if it has less than 17 characters`() {
        assertFalse(StrongValidation.validate("wrong"))
    }

    @Test
    fun `should be valid`() {
        assertTrue(StrongValidation.validate("P_ssWordP_ssWord_"))
    }

    @Test
    fun `should be invalid if it does not contain an underscore`() {
        assertFalse(StrongValidation.validate("PasswordPasswordPassword"))
    }

    @Test
    fun `should be invalid if it does not contain a capital letter`() {
        assertFalse(StrongValidation.validate("passwordpasswordpassword"))
    }

    @Test
    fun `should be invalid if it does not contain a lower case letter`() {
        assertFalse(StrongValidation.validate("P_SSWORDP_SSWORDP_SSWORD"))
    }


}