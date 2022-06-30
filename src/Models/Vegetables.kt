package Models

class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {

    override fun toString(): String {
        return if (toppings.isEmpty()) "$name Chef's Choice" else name + " " + toppings.joinToString()
    }
}