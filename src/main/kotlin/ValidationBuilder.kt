class ValidationBuilder() {
    private var minimumNumberOfCharacters: Int = 0
    private var allowsUpperCase: Boolean = false
    private var allowsLowerCase: Boolean = false
    private var allowsDigits: Boolean = false
    private var allowsUnderscore: Boolean = false

    fun withMinimumNumberOfCharacters(number: Int): ValidationBuilder {
        this.minimumNumberOfCharacters = number
        return this
    }

    fun withUpperCase(): ValidationBuilder {
        this.allowsUpperCase = true
        return this
    }

    fun withLowerCase(): ValidationBuilder {
        this.allowsLowerCase = true
        return this
    }

    fun withDigits(): ValidationBuilder {
        this.allowsDigits = true
        return this
    }

    fun withUnderscore(): ValidationBuilder {
        this.allowsUnderscore = true
        return this
    }

    fun build(): Validation{
        return Validation(minimumNumberOfCharacters,
            allowsUpperCase, allowsLowerCase,
            allowsDigits, allowsUnderscore)
    }

}