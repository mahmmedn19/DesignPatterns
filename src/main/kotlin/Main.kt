import designPatterns.decoration.Coffee
import designPatterns.decoration.Espresso
import designPatterns.decoration.Sugar
import designPatterns.decoration.WithMilk

fun main() {
    var coffee: Coffee= Espresso()
    coffee = WithMilk(coffee)
    coffee = Sugar(coffee)

    println("Order: ${coffee.getDescription()}")
    println("Total cost: $${coffee.getCost()}")
}