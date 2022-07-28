package com.bootcampexcercise.module8.activity;

//Needs to be completed
import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List names = new ArrayList();
        names.add("Jelena");
        names.add("Gabi");
        names.add("Fotokakis");
        names.add("Vladimir");
        names.add("John");
        //TODO: 2 - Call print method to print the list passed as its parameter.
        print(names);
    }
    static void print(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        System.out.println(list);
    }
}
