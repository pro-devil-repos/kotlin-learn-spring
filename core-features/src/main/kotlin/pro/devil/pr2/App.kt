package pro.devil.pr2


fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)

    printResult(gameChoice, userChoice)
}

fun getGameChoice(optionsParam: Array<String>): String = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var userInput: Int? = null

    while (userInput == null) {
        println("Please enter one of the following number:")
        for ((i, v) in optionsParam.withIndex()) {
            println("${i + 1} - $v")
        }

        try {
            userInput = readLine()?.toInt() ?: throw NumberFormatException()

            if (userInput !in 1..3) {
                userInput = null
                throw NumberFormatException()
            }

        } catch (e: NumberFormatException) {
            println("Wrong Input Format")
        }
    }

    return optionsParam[userInput - 1]
}

fun printResult(userChoice: String, gameChoice: String) {
    //Определить результат
    val result: String =
        if (userChoice == gameChoice) "Tie!"
        else if (
            (userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper")
        ) "You win!"
        else "You lose!"
    //Вывести результат
    println("You chose $userChoice. I chose $gameChoice. $result")
}