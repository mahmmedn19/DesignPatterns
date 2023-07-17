package designPatterns.factory.simple

import designPatterns.factory.Pizza
import java.util.*

class SimplePizzaFactory {

    fun createPizza(type:String): Pizza?{
        return when(type.lowercase(Locale.getDefault())){
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            else -> null
        }
    }

}