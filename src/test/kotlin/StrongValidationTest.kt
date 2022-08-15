import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class StrongValidationTest {

    @Test
    fun `should be invalid if it has less than 17 characters`() {
        assertFalse(ValidationFactory.createStrongValidation().validate("wrong"))
    }

    @Test
    fun `should be valid`() {
        assertTrue(ValidationFactory.createStrongValidation().validate("P_ssWordP_ssWord_"))
    }

    @Test
    fun `should be invalid if it does not contain an underscore`() {
        assertFalse(ValidationFactory.createStrongValidation().validate("PasswordPasswordPassword"))
    }

    @Test
    fun `should be invalid if it does not contain a capital letter`() {
        assertFalse(ValidationFactory.createStrongValidation().validate("p_sswordpasswordpassword"))
    }

    @Test
    fun `should be invalid if it does not contain a lower case letter`() {
        assertFalse(ValidationFactory.createStrongValidation().validate("P_SSWORDP_SSWORDP_SSWORD"))
    }


}