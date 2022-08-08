import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class SoftValidationTest {

// Validation 2:
//
// Have more than 6 characters
// Contains a capital letter
// Contains a lowercase
// Contains a number


// Validation 3:
//
// Have more than 16 characters
// Contains a capital letter
// Contains a lowercase
// Contains an underscore

    @Test
    fun `should be invalid if it has less than 7 characters`() {
        assertFalse(SoftValidation.validate("wrong"))
    }

    @Test
    fun `should be valid`() {
        assertTrue(SoftValidation.validate("P4ssWord"))
    }

    @Test
    fun `should be invalid if it does not contain a number`() {
        assertFalse(SoftValidation.validate("Password"))
    }

    @Test
    fun `should be invalid if it does not contain a capital letter`() {
        assertFalse(SoftValidation.validate("password"))
    }

    @Test
    fun `should be invalid if it does not contain a lower case letter`() {
        assertFalse(SoftValidation.validate("P4SSWORD"))
    }


}