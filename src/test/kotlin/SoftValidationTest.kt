import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class SoftValidationTest {

    @Test
    fun `should be invalid if it has less than 7 characters`() {
        assertFalse(ValidationFactory.createSoftValidation().validate("wrong"))
    }

    @Test
    fun `should be valid`() {
        assertTrue(ValidationFactory.createSoftValidation().validate("P4ssWord"))
    }

    @Test
    fun `should be invalid if it does not contain a number`() {
        assertFalse(ValidationFactory.createSoftValidation().validate("Password"))
    }

    @Test
    fun `should be invalid if it does not contain a capital letter`() {
        assertFalse(ValidationFactory.createSoftValidation().validate("p4ssword"))
    }

    @Test
    fun `should be invalid if it does not contain a lower case letter`() {
        assertFalse(ValidationFactory.createSoftValidation().validate("P4SSWORD"))
    }

}