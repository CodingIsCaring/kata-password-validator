class Application {
    companion object {
        fun validate(password: String): Boolean {
            if (!isLongEnough(password)) {
                return false
            }

            if (hasNoDigits(password)) {
                return false
            }

            if (hasNoUppercase(password)) {
                return false
            }

            if (hasNoLowercase(password)) {
                return false
            }

            return true
        }

        private fun hasNoLowercase(password: String): Boolean {
            val totalLowercaseLetters = password.count { it.isLowerCase() }
            val hasNoLowercase = totalLowercaseLetters == 0
            return hasNoLowercase
        }

        private fun hasNoUppercase(password: String): Boolean {
            val totalUppercaseLetters = password.count { it.isUpperCase() }
            val hasNoUppercase = totalUppercaseLetters == 0
            return hasNoUppercase
        }

        private fun hasNoDigits(password: String): Boolean {
            val totalDigits = password.count { it.isDigit() }
            val hasNoDigits = totalDigits == 0
            return hasNoDigits
        }

        private fun isLongEnough(password: String) = password.length >= 9
    }
}