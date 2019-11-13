package com.example.thefoodapp;

public class Food {
    private  String name;
    private String description;

   public static final Food [] foods = {
            new Food("Pizza", "Think crust pizza with extra cheese"),
        new Food("Burger", "Veg Burger with healthy stuff"),
        new Food("Sandwhich", "Whole wheat sandwhich "),

};

public Food(String  name, String description){  //Setter
        this.name = name;
        this.description = description;
        }

    public String getName(){    //Getter
    return name;
    }

    public String getDescription(){ //Getter
        return description;
    }

    public String toString(){
    return  this.name;
    }
}
