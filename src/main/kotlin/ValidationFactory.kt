class ValidationFactory {
    companion object {
        fun createSoftValidation(): Validation {
            return Validation(
                7,true,
                true,true,false)
        }

        fun createStrongValidation(): Validation {
            return Validation(17, true,
            true, false, true)
        }
    }
}
