 package com.example.myapplication

 fun main() {
    // Test the Pizza factory method
     val pizza1 = Pizza.Factory.createPizza("Tomato")
        val pizza2 = Pizza.Factory.createPizza("PeppyPaneer")
            val pizza3 = Pizza.Factory.createPizza("UnknownType")

    println(pizza1)  // Output: Pizza(type=Tomato, topping=Tomato, cheese)
         println(pizza2)  // Output: Pizza(type=paneer Farm, topping=Paneer, Cheese Burst, Tomato, onion)
            println(pizza3)  // Output: Pizza(type=Basic, topping=onion, Cheese)
}

 class Pizza(val type: String, val topping: String) {
    companion object Factory {
        fun createPizza(type: String): Pizza {
            return when (type) {
                "Tomato" -> Pizza("Tomato", "Tomato, cheese")
                   "PeppyPaneer" -> Pizza("paneer Farm", "Paneer, Cheese Burst, Tomato, onion")
                       else -> Pizza("Basic", "onion, Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type=$type, topping=$topping)"
    }
}
