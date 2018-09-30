package com.gorton.builder

import com.gorton.models.meal.Meal

class MealDirector {
    Meal makeMeal(MealBuilder mealBuilder){
        mealBuilder.buildMain()
        mealBuilder.buildDrink()
        mealBuilder.buildSide()
        mealBuilder.meal
    }
}
