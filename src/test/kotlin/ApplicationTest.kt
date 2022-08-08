import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ApplicationTest {
    @Test
    fun `should be invalid password when has less than 8 characters`() {
        assertFalse(Application.validate("pass"))
    }

    @Test
    fun `invalid password when has 8 characters`() {
        assertFalse(Application.validate("password"))
    }

    @Test
    fun `should be valid password`() {
        assertTrue(Application.validate("p4sswOrds_"))
    }

    @Test
    fun `should be invalid if does not contain at least one capital letter`() {
        assertFalse(Application.validate("passwords"))
    }

    @Test
    fun `should be invalid if does not contain at least one lower case`() {
        assertFalse(Application.validate("PASSWORDS"))
    }

    @Test
    fun `should be invalid if does not contain at least a number`() {
        assertFalse(Application.validate("passwords"))
    }

    @Test
    fun `should be invalid if does not contain an underscore`() {
        assertFalse(Application.validate("p4sswOrds"))
    }

}