package designPatterns.decoration


class WithMilk(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun getDescription() = "${coffee.getDescription()}, Milk"
    override fun getCost() = coffee.getCost() + 0.5
}