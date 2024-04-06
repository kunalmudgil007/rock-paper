package eu.tutorials.rockpaperseissors

//   fun main() {
//    var computerChoice = ""
//    var playerChoice = ""
//
//    println("Rock , Paper or scissors ? enter your choice!")
//    playerChoice = readln()
//    val randomNumbers = (1..3).random()
//    when (randomNumbers) {
//        1 -> {
//            computerChoice = "Rock"
//        }
//        2 -> {
//            computerChoice = "Paper"
//        }
//        3 -> {
//            computerChoice = "Scissors"
//        }
//    }
//       println(computerChoice)
//
//           val winner = when {
//               playerChoice == computerChoice -> "Tie"
//
//               playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
//               playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
//               playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
//               else -> " computer"
//           }
//               if(winner=="Tie") {
//                   println("It's a Tie")
//               }
//
//                   else {
//                       println("$winner won!")
//               }
//   }



fun main() {
    var playAgain = true

    while (playAgain) {
        var computerChoice = ""
        var playerChoice = ""

        println("Rock, Paper, or Scissors? Enter your choice:")
        playerChoice = readLine().toString()

        val randomNumbers = (1..3).random()
        when (randomNumbers) {
            1 -> computerChoice = "Rock"
            2 -> computerChoice = "Paper"
            3 -> computerChoice = "Scissors"
        }

        println("Computer chose: $computerChoice")

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }

        if (winner == "Tie") {
            println("It's a Tie")
        } else {
            println("$winner won!")
        }

        println("Play again? (y/n)")
        val playAgainInput = readLine().toString()
        playAgain = playAgainInput.equals("y", ignoreCase = true)
    }



}
