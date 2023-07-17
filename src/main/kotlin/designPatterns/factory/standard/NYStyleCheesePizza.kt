package designPatterns.factory.standard

import designPatterns.factory.Pizza

class NYStyleCheesePizza:Pizza {
    override fun prepare() {
        println("Preparing NY Style Cheese Pizza")
    }

    override fun bake() {
        println("Baking NY Style Cheese Pizza")
    }

    override fun cut() {
        println("Cutting NY Style Cheese Pizza")
    }

    override fun box() {
        println("Boxing NY Style Cheese Pizza")
    }
}