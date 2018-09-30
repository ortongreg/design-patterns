package com.gorton.creational.builder

class KidsMealBuilder extends MealBuilder {
    void buildMain() { meal.main = "PBJ" }
    void buildSide() { meal.side = "Applesauce" }
    void buildDrink() { meal.drink = "Milk" }
}
