package pro.devil.pr6

class Contest<T : Pet>(var vet: Vet<T>) {
    private val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores[t] = score
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.maxOrNull()
        val winners: MutableSet<T> = mutableSetOf()

        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }

        return winners
    }
}