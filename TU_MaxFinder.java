package com.abhi.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 * TU_MaxFinder -- This program contains Test Cases
 *                 Giving sample input & checking output given
 *                 matches with expected output / not
 *
 *
 * @author Abhishek Shigavan
 */
public class TU_MaxFinder {
/**
 * Checking program gives correct max element
 * when Max element is at 1st position
 */
    @Test
    void whenMaxAtFirstPosition() {

        Integer[] intArray ={9, 7, 1, 2, 5, 4};
        Integer max_Number = MaxFinder.find_Max(intArray);
        Assertions.assertEquals(9,max_Number,"Validating Max Method");

        Float[] floatArray ={30f, 3.14f, 5.99f, 29.99f, 27.21f};
        Float max_Float = MaxFinder.find_Max(floatArray);
        Assertions.assertEquals(30f,max_Float,"Validating Max Method");

        String[] stringArray ={"Catch", "Ball", "Apple", "Cat", "Bat"};
        String max_string = MaxFinder.find_Max(stringArray);
        Assertions.assertEquals("Catch",max_string,"Validating Max Method");

        new MaxFinder(intArray).find_Max();
        new MaxFinder(floatArray).find_Max();
        new MaxFinder(stringArray).find_Max();
    }
/**
 * Checking program gives correct max element
 * when Max element is in between First & Last position
 */
    @Test
    void whenMaxIsBetweenPosition() {

        Integer[] intArray ={7, 1, 2, 9, 5, 4};
        Integer max_Number = MaxFinder.find_Max(intArray);
        Assertions.assertEquals(9,max_Number,"Validating Max Method");

        Float[] floatArray ={3.14f, 5.99f, 30F, 29.99f, 27.21f, 7.7734f};
        Float max_Float = MaxFinder.find_Max(floatArray);
        Assertions.assertEquals(30f,max_Float,"Validating Max Method");

        String[] stringArray ={"Map", "Lamp", "Dog", "Watch", "Ball", "Apple", "Cat", "Bat"};
        String max_string = MaxFinder.find_Max(stringArray);
        Assertions.assertEquals("Watch",max_string,"Validating Max Method");

        new MaxFinder(intArray).find_Max();
        new MaxFinder(floatArray).find_Max();
        new MaxFinder(stringArray).find_Max();
    }
/**
 * Checking program gives correct max element
 * when Max element is at Last position
 */
    @Test
    void whenMaxAtLastPosition() {

        Integer[] intArray ={6, 8, 7, 1, 2, 5, 4, 9};
        Integer max_Number = MaxFinder.find_Max(intArray);
        Assertions.assertEquals(9,max_Number,"Validating Max Method");

        Float[] floatArray ={7.77f, 27.21f, 3.14f, 5.99f, 29.99f, 30f};
        Float max_Float = MaxFinder.find_Max(floatArray);
        Assertions.assertEquals(30f,max_Float,"Validating Max Method");

        String[] stringArray ={"Catch", "Ball", "Apple", "Cat", "Bat", "Watch"};
        String max_string = MaxFinder.find_Max(stringArray);
        Assertions.assertEquals("Watch",max_string,"Validating Max Method");

        new MaxFinder(intArray).find_Max();
        new MaxFinder(floatArray).find_Max();
        new MaxFinder(stringArray).find_Max();
    }
}
