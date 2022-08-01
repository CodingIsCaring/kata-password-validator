import org.junit.Test

class ApplicationTest {
    @Test
    fun say_hello_world() {
        kotlin.test.assertEquals("Hello world!", Application.helloWorld())
    }
}