package com.bootcampexcercise.module9.activity;

public class Person {

        private int weight;
        private float height;

        //TODO: Create getters and setters for weight and height
        public float getHeight() {
            return height;
        }
        public int getWeight() {
            return weight;
        }
        public void setHeight(float height) {
            this.height = height;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String calculateBMI(int weight, float height){
            //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
            //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
            //TODO: Please add some checks for max weight and height (kg and meter are their units)
            //TODO: Also add some checks that value shouldn't be negative and 0
            // Note: All TODOs should be implemented in single method

            if (weight > 150){
                System.out.println("Weight should not be more than 100. Setting weight to 100");
                weight = 100;
            }
            if (height > 2.5){
                System.out.println("Height should not be more than 2.0. Setting height to 1.77");
                height = 1.77F;
            }
            float BMI = weight/(height*height);
            if (BMI > 0){
                String result = "" + BMI;
                return result;
            }
            return "Value shouldn't be negative and zero";
        }
    }
