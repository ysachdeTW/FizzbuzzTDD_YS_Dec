package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
     @Test
    public void testFizzBuzzIfDivisibleBy3(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        String result = fizzbuzz.generateFizzbuzz("3");
        assertEquals("Fizz",result);

   }

}