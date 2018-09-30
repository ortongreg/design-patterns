package com.gorton.creational.builder

import com.gorton.models.meal.Meal

abstract class MealBuilder {
    Meal meal = new Meal()

    abstract void buildMain()
    abstract void buildSide()
    abstract void buildDrink()
}
