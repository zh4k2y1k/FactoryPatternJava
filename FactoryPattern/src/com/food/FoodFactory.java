package com.food;

public class FoodFactory {
    public Food getInstance(String str){
        if(str.equals("Pizza"))
            return new Pizza();
        else if(str.equals("Burger"))
            return new Cheeseburger();
        else
            return new FriedChicken();
    }
}
