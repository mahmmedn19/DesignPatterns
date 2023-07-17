import designPatterns.decoration.Coffee
import designPatterns.decoration.Espresso
import designPatterns.decoration.Sugar
import designPatterns.decoration.WithMilk
import designPatterns.factory.simple.SimplePizzaFactory
import designPatterns.factory.standard.MoNaserStylePizzaStore

fun main() {
    // this for decorator patterns
    /*    var coffee: Coffee= Espresso()
        coffee = WithMilk(coffee)
        coffee = Sugar(coffee)

        println("Order: ${coffee.getDescription()}")
        println("Total cost: $${coffee.getCost()}")*/

    // this for simple factory patterns
    //**********************

    /*    val cheesePizza= SimplePizzaFactory()
        val createPizza = cheesePizza.createPizza("cheese")
        createPizza?.prepare()
        createPizza?.bake()
        createPizza?.cut()
        createPizza?.box()*/
    //*********output*******
    /*Preparing Cheese Pizza
    Baking Cheese Pizza
    Cutting Cheese Pizza
    Boxing Cheese Pizza*/
    //**********************

    // this for standard factory patterns

    val naserStylePizza = MoNaserStylePizzaStore()
    val orderPizza = naserStylePizza.orderPizza("naserPizza")
    //********output**********
    /*
    Preparing MoNaserStylePizza
    Baking MoNaserStylePizza
    Cutting MoNaserStylePizza
    Boxing MoNaserStylePizza
    */
    //********************************

}