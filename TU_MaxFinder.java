package com.abhi.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 * TU_MaxFinder -- This program contains Test Cases
 *
 * @author Abhishek Shigavan
 */
public class TU_MaxFinder {
/**
 * Checking program gives correct maximum
 * number / not
 * when Maximum number is at 1st position
 */
    @Test
    void whenMaxNumAt1Position() {
        Integer num1 =7, num2 =3, num3 =5;
        Integer max_Number = MaxFinder.find_MaxInteger(num1, num2, num3);
        Assertions.assertEquals(7,max_Number,"Validating Max Method");
    }
/**
 * Checking program gives correct maximum
 * number / not
 * when Maximum number is at 2nd position
 */
    @Test
    void whenMaxNumAt2Position() {
        Integer num1 =3, num2 =7, num3 =5;
        Integer max_Number = MaxFinder.find_MaxInteger(num1, num2, num3);
        Assertions.assertEquals(7,max_Number,"Validating Max Method");
    }
/**
 * Checking program gives correct maximum
 * number / not
 * when Maximum number is at 3rd position
 */
    @Test
    void whenMaxNumAt3Position() {
        Integer num1 =3, num2 =5, num3 =7;
        Integer max_Number = MaxFinder.find_MaxInteger(num1, num2, num3);
        Assertions.assertEquals(7,max_Number,"Validating Max Method");
    }
/**
 * Checking program gives correct maximum
 * Floating no / not
 * when Maximum Floating no is at 1st position
 */
    @Test
   void whenMaxFloatAt1Position() {
        Float num1 =30f, num2 =3.14f, num3 =5.99f;
        Float max_Number = MaxFinder.find_MaxFloat(num1, num2, num3);
        Assertions.assertEquals(30f,max_Number,"Validating Max Method");
    }
/**
 * Checking program gives correct maximum
 * floating no /not
 * when Maximum floating no is at 2nd position
 */
    @Test
    void whenMaxFloatAt2Position() {
        Float num1 =3.14f, num2 =30f, num3 =5.99f;
        Float max_Number = MaxFinder.find_MaxFloat(num1, num2, num3);
        Assertions.assertEquals(30f,max_Number,"Validating Max Method");
    }
/**
 * Checking program gives correct maximum
 * float no / not
 * When Maximum floating no is at 3rd position
 */
    @Test
    void whenMaxFloatAt3Position() {
        Float num1 =5.99f, num2 =3.14f, num3 =30f;
        Float max_Number = MaxFinder.find_MaxFloat(num1, num2, num3);
        Assertions.assertEquals(30f,max_Number,"Validating Max Method");
    }
}
