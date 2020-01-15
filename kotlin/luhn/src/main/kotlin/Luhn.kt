object Luhn {

    fun isValid(candidate: String): Boolean {
        val cleanCandidate = candidate.replace(" ", "")

       return when {
            valid(cleanCandidate) -> luhnComputation(cleanCandidate) % 10 == 0
            else -> false
        }
    }

    private fun valid(cleanCandidate: String) = cleanCandidate.all(Char::isDigit) && cleanCandidate.length > 1

    private fun luhnComputation(cleanCandidate: String) =
            cleanCandidate.map { it.toInt() - '0'.toInt() }
                    .reversed()
                    .mapIndexed { index, value -> if (index % 2 == 1 && value < 9) (value * 2) % 9 else value }
                    .sum()
}
