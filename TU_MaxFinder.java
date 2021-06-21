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
        Integer max_Number = MaxFinder.find_Max(num1, num2, num3);
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
        Integer max_Number = MaxFinder.find_Max(num1, num2, num3);
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
        Integer max_Number = MaxFinder.find_Max(num1, num2, num3);
        Assertions.assertEquals(7,max_Number,"Validating Max Method");
    }
}
