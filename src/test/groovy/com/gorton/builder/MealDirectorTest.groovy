package com.gorton.builder

import com.gorton.abstractfactory.MobileLawyerFactory
import com.gorton.abstractfactory.MobilePerson
import com.gorton.abstractfactory.MobileSocialWorkerFactory
import com.gorton.models.person.Lawyer
import com.gorton.models.person.SocialWorker
import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner)
class MealDirectorTest {

    MealDirector director = new MealDirector()

    @Test
    void TestMakeBurgerBasket() {
        def burgerBasketBuilder = new BurgerBasketBuilder()
        director.makeMeal(burgerBasketBuilder)
        def meal = burgerBasketBuilder.meal
        assert "Burger, Fries and Soda" == meal.toString()
    }

    @Test
    void TestMakeKidsMeal() {
        def kidsMealBuilder = new KidsMealBuilder()
        director.makeMeal(kidsMealBuilder)
        def meal = kidsMealBuilder.meal
        assert "PBJ, Applesauce and Milk" == meal.toString()
    }
}
