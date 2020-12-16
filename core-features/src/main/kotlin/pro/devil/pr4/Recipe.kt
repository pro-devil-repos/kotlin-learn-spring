package pro.devil.pr4

data class Recipe(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
)