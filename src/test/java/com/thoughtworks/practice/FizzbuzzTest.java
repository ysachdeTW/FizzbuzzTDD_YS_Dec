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


    @Test
    public void testFizzBuzzIfDivisibleBy3and5(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        String result = fizzbuzz.generateFizzbuzz("15");
        assertEquals("fizzbuzz",result);
    }
    @Test
    public void testFizzBuzzIfNotDivisibleBy3and5(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        String result = fizzbuzz.generateFizzbuzz("2");
        assertEquals("not fizzy or buzzy",result);
    }

    @Test
    public void testFizzBuzzWithNoNumberInput(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        String input= "No Number";
        String result = fizzbuzz.generateFizzbuzz(input);
        assertEquals(input,result);
    }
    @Test
    public void testFizzBuzzNullInput(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        String result = fizzbuzz.generateFizzbuzz(null);
        assertNull(result);
    }
}