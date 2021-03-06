enum class PitchLetter {
    A, B, C, D, E, F, G;

    fun intValue(): Int = when(this) {
        A -> 9
        B -> 11
        C -> 0
        D -> 2
        E -> 4
        F -> 5
        G -> 7
    }

    operator fun plus(i: Int): PitchLetter {
        val values = values()
        val add = if (i < 0) i + values.size else i
        val nextIndex = (ordinal + add) % values.size
        return values[nextIndex]
    }
}