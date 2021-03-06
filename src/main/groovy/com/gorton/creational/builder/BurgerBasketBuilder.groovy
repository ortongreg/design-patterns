package com.gorton.creational.builder

class BurgerBasketBuilder extends MealBuilder {
    void buildMain() { meal.main = "Burger" }
    void buildSide() { meal.side = "Fries" }
    void buildDrink() { meal.drink = "Soda" }
}
