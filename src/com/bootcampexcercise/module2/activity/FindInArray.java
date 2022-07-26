package com.bootcampexcercise.module2.activity;

public class FindInArray {
    public static void main(String args[]){

        // Create an integer array
        int[] nums = {100, 1, 4, 15};

        int result = nums[0];

        // Find smallest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }
        System.out.println("Smallest in array is "+result);

        result = nums[0];

        //TODO Find largest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result){
                result = nums[1];
            }
            //TODO complete the code
        }
        System.out.println("Largest in array is "+result);

        int [] coins = {20, 2, 50, 1, 10, 5};
        int biggest = coins [0];
        for (int i = 0; i< coins.length; i++){
            if(coins[i]>biggest){
                biggest=coins[i];
            }
        }
        System.out.println(biggest);
    }
    }
