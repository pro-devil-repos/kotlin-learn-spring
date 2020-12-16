package pro.devil.pr3

fun main() {

    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")

    songOne.play()
    songOne.stop()
    songTwo.play()
    songTwo.stop()
    songThree.play()

    val myDog = Dog("Fido", 34, "White")
    myDog.bark()
    myDog.weight = 25
    println("Weight in kgs of my dog is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")

}