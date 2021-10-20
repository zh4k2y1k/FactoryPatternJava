package com.company;

import com.food.Food;
import com.food.FoodFactory;
import com.food.FriedChicken;

public class Main {

    public static void main(String[] args) {
        FoodFactory ff = new FoodFactory();
        Food obj = ff.getInstance("Burger");
        obj.spec();
    }
}
