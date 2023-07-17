package designPatterns.factory.standard

import designPatterns.factory.Pizza
import java.util.*

class NYStylePizzaStore:PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when(type.lowercase(Locale.getDefault())){
            "cheese" -> NYStyleCheesePizza()
            else -> throw IllegalArgumentException("Invalid pizza type: $type")
        }
    }
}