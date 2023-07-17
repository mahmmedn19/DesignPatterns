package designPatterns.factory.standard

import designPatterns.factory.Pizza
import java.util.*

class MoNaserStylePizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "naserPizza" -> MoNaserStylePizza()
            else -> throw IllegalArgumentException("Invalid pizza type: $type")
        }
    }
}
