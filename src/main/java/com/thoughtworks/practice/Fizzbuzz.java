package com.thoughtworks.practice;

public class Fizzbuzz {

    public String generateFizzbuzz(String inputString){
        StringBuilder response= new StringBuilder();
         int input =Integer.parseInt(inputString);

         if(input % 3 == 0) response.append("Fizz");

        return response.toString();
    }
}
