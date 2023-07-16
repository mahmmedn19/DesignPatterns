package designPatterns.decoration

class Sugar(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun getDescription() = "${coffee.getDescription()}, Sugar"
    override fun getCost() = coffee.getCost() + 0.25
}