package com.gorton.models.meal

class Meal {
    String main
    String side
    String drink

    @Override
    String toString() {
        "${main}, ${side} and ${drink}"
    }
}
