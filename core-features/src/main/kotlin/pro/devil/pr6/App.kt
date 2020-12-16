package pro.devil.pr6

fun main() {
    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(Cat("Fuzz Lightyear"), 50)
    catContest.addScore(Cat("Katsu"), 45)
    val topCat = catContest.getWinners().first()

    println("Cat contest winner is ${topCat.name}")
    // catContest.addScore(Dog("Fido"), 23)

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(Cat("Fuzz Lightyear"), 50)
    petContest.addScore(Fish("Finny McGraw"), 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")


    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()

    // Благодаря тому, что обобщенный тип объявлен как out
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()



    catVet.treat(Cat("Fuzz Lightyear"))
    petVet.treat(Cat("Katsu"))
    petVet.treat(Fish("Finny McGraw"))
    // catVet.treat(Fish("Finny McGraw"))


}