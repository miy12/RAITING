class Dish(
    val id: Int,
    val name: String,
    val category: String,
    val ingredients: String,
    val price: String
)

fun main() {
    val menu = mutableListOf<Dish>()
    var nextId = 1

    // Добавляем примеры блюд
    menu.add(Dish(nextId++, "Борщ", "Супы", "свёкла, капуста, картофель, мясо", "320"))
    menu.add(Dish(nextId++, "Паста Карбонара", "Паста", "спагетти, бекон, яйцо, пармезан", "450"))
    menu.add(Dish(nextId++, "Чизкейк", "Десерты", "сыр, печенье, сливки", "280"))
    menu.add(Dish(nextId++, "Цезарь с курицей", "Салаты", "курица, салат, сухарики, соус", "390"))

    while (true) {
        println("\n=== РЕСТОРАН ===")
        println("1. Показать меню")
        println("2. Добавить блюдо")
        println("0. Выход")
        print("Выбор: ")
        when (readLine()) {
            "1" -> {
                if (menu.isEmpty()) {
                    println("Меню пусто")
                } else {
                    for (dish in menu) {
                        println("ID: ${dish.id}")
                        println("Название: ${dish.name}")
                        println("Категория: ${dish.category}")
                        println("Ингредиенты: ${dish.ingredients}")
                        println("Цена: ${dish.price} руб.")
                        println("-------------------")
                    }
                }
            }
            "2" -> {
                print("Название: ")
                val name = readLine() ?: ""
                print("Категория: ")
                val category = readLine() ?: ""
                print("Ингредиенты (через запятую): ")
                val ingredients = readLine() ?: ""
                print("Цена: ")
                val price = readLine() ?: ""
                menu.add(Dish(nextId++, name, category, ingredients, price))
                println("Блюдо добавлено!")
            }
            "0" -> {
                println("До свидания!")
                break
            }
            else -> println("Неверный выбор")
        }
    }
}