package designPatterns.factory.standard

import designPatterns.factory.Pizza

class MoNaserStylePizza:Pizza {
    override fun prepare() {
        println("Preparing MoNaserStylePizza")
    }

    override fun bake() {
        println("Baking MoNaserStylePizza")
    }

    override fun cut() {
        println("Cutting MoNaserStylePizza")
    }

    override fun box() {
        println("Boxing MoNaserStylePizza")
    }
}