package com.bootcampexcercise.module8.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        Map myMap = new HashMap();
        myMap.put("01","Jelena");
        myMap.put("02","Jelena");
        myMap.put("03","Gabi");
        myMap.put("04","Vladimir");

        //2 - Call print method to print the map passed as its parameter.
        print(myMap);
    }
    static void print(Map map)
    {
        //3 - Type code to print this map
        System.out.println(map);
    }
}
