class SoftValidation {
    companion object {
        fun validate(password: String): Boolean {
            if (!hasEnoughCharacters(password)) {
                return false
            }

            if (!hasADigit(password)) {
                return false
            }

            if (!hasUpperCase(password)) {
                return false
            }

            if (!hasLowerCase(password)) {
                return false
            }

            return true
        }

        private fun hasEnoughCharacters(password: String): Boolean {
            return password.length > 6
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
    }
}