package com.bootcampexcercise.module2.activity;

public class NumToWords {
    public static void main(String args[]){
    int i = 5;
    String Numtext ="";

    switch (i){
        case 1:
    Numtext = "ONE";
    break;

        case 2:
            Numtext = "TWO";
            break;

        case 3:
            Numtext = "THREE";
            break;

        case 4:
            Numtext = "FOUR";
            break;

        case 5:
            Numtext = "FIVE";
            break;
        case 6:
            Numtext = "SIX";
            break;

        case 7:
            Numtext = "SEVEN";
            break;

        case 8:
            Numtext = "EIGHT";
            break;

        case 9:
            Numtext = "NINE";
            break;
        case 10:
            Numtext = "TEN";
            break;
        default:
    Numtext = "number" + i;

    }
        System.out.println(Numtext);
    }
}
