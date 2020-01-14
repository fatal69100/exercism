object Isogram {

    fun isIsogram(input: String): Boolean {
        var clean = input.filter { it.isLetter() }
        return clean.toCharArray().size == clean.toLowerCase().toCharArray().distinct().size
    }
}
