class Validation(
    private val minimumNumberOfCharacters: Int,
    private val allowsUpperCase: Boolean,
    private val allowsLowerCase: Boolean,
    private val allowsDigits: Boolean,
    private val allowsUnderscore: Boolean
) {

    fun validate(password: String): Boolean {
        if (!hasEnoughCharacters(password)) {
            return false
        }

        if (allowsDigits && !hasADigit(password)) {
            return false
        }

        if (allowsUpperCase && !hasUpperCase(password)) {
            return false
        }

        if (allowsLowerCase && !hasLowerCase(password)) {
            return false
        }

        if (allowsUnderscore && !hasUnderscore(password)) {
            return false
        }

        return true
    }

    private fun hasEnoughCharacters(password: String): Boolean {
        return password.length >= minimumNumberOfCharacters
    }

    private fun hasLowerCase(password: String): Boolean {
        val totalLowerCaseLetters = password.count { it.isLowerCase() }
        return totalLowerCaseLetters != 0
    }

    private fun hasADigit(password: String): Boolean {
        val totalDigits = password.count { it.isDigit() }
        return totalDigits != 0
    }

    private fun hasUpperCase(password: String): Boolean {
        val totalUpperCaseLetters = password.count { it.isUpperCase() }
        return totalUpperCaseLetters != 0
    }

    private fun hasUnderscore(password: String): Boolean {
        return password.contains("_")
    }
}