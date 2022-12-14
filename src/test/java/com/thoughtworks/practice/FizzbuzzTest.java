package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
     @Test
    public void testFizzBuzzIfDivisibleBy3(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        String result = fizzbuzz.generateFizzbuzz("3");
        assertEquals("fizz",result);

   }


    @Test
    public void testFizzBuzzIfDivisibleBy5(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        String result = fizzbuzz.generateFizzbuzz("5");
        assertEquals("buzz",result);

    }
}