package designPatterns.factory.simple

class CheesePizza : Pizza {
    override fun prepare() {
        println("Preparing Cheese Pizza")
    }

    override fun bake() {
        println("Baking Cheese Pizza")
    }

    override fun cut() {
        println("Cutting Cheese Pizza")
    }

    override fun box() {
        println("Boxing Cheese Pizza")
    }
}