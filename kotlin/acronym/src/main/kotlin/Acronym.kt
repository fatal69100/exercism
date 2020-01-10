object Acronym {
    private val acronymSpaceRegex = "[\\s-_]+".toRegex()

    fun generate(phrase: String) : String {
       return phrase.split(acronymSpaceRegex).joinToString("") { it.first().toUpperCase().toString() }
    }
}
