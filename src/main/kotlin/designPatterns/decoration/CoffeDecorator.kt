package designPatterns.decoration

abstract class CoffeeDecorator(val coffee: Coffee) : Coffee {
    override fun getDescription() = coffee.getDescription()
    override fun getCost() = coffee.getCost()
}