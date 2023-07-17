package designPatterns.factory.standard

import designPatterns.factory.Pizza

abstract class PizzaStore {
    protected abstract fun createPizza(type: String): Pizza

    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }
}