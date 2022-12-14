package com.thoughtworks.practice;

public class Fizzbuzz {

    public String generateFizzbuzz(String inputString){
        StringBuilder response= new StringBuilder();
        int input;
        try {
           input = Integer.parseInt(inputString);
        }catch (NumberFormatException e){
            return inputString;
        }


         if(input % 3 == 0) response.append("fizz");
         if(input % 5 == 0) response.append("buzz");
         if(response.isEmpty()) response.append("not fizzy or buzzy");

        return response.toString();
    }
}
