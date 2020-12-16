package pro.devil.pr4

fun main() {
    val r1 = Recipe("Thai Curry", "Chicken")
    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")

    val r3 = r1.copy(title = "Chicken Bhuna")

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")

    println("r1 to String: $r1")

    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    val (title, vegetarian) = r1

    println("title is $title and vegetarian is $vegetarian")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(2, 5))
    println(addNumbers(1.6, 7.3))
}

fun finRecipes(
    title: String = "",
    ingredient: String = "",
    isVegetarian: Boolean = false,
    difficulty: String = ""
): Array<Recipe> {
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}

fun addNumbers(a: Int, b: Int) = a + b
fun addNumbers(a: Double, b: Double) = a + b
