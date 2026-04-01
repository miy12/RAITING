class Dish {
    var id = 0
    var name = ""
    var category = ""
    var price = 0.0
    var ingredients = ""

    fun showDish() {
        println("$id: $name")
        println("   Категория: $category")
        println("   Ингредиенты: $ingredients")
        println("   Цена: $price руб.")
    }
}