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
 * Checking program gives correct max element
 * when Max element is at 1st position
 */
    @Test
    void whenMaxAt1Position() {

        Integer num1 =7, num2 =3, num3 =5;
        Integer max_Number = MaxFinder.find_Max(num1, num2, num3);
        Assertions.assertEquals(7,max_Number,"Validating Max Method");

        Float fnum1 =30f, fnum2 =3.14f, fnum3 =5.99f;
        Float max_Float = MaxFinder.find_Max(fnum1, fnum2, fnum3);
        Assertions.assertEquals(30f,max_Float,"Validating Max Method");

        String str1 ="Cat", str2 ="Ball", str3 ="Apple";
        String max_string = MaxFinder.find_Max(str1, str2, str3);
        Assertions.assertEquals("Cat",max_string,"Validating Max Method");

        new MaxFinder(num1, num2, num3).find_Max();
        new MaxFinder(fnum1, fnum2, fnum3).find_Max();
        new MaxFinder(str1, str2, str3).find_Max();
    }
/**
 * Checking program gives correct max element
 * when Max element is at 2nd position
 */
    @Test
    void whenMaxAt2Position() {
        Integer num1 =3, num2 =7, num3 =5;
        Integer max_Number = MaxFinder.find_Max(num1, num2, num3);
        Assertions.assertEquals(7,max_Number,"Validating Max Method");

        Float fnum1 =3.14f, fnum2 =30f, fnum3 =5.99f;
        Float max_Float = MaxFinder.find_Max(fnum1, fnum2, fnum3);
        Assertions.assertEquals(30f,max_Float,"Validating Max Method");

        String str1 ="Ball", str2 ="Cat", str3 ="Apple";
        String max_string = MaxFinder.find_Max(str1, str2, str3);
        Assertions.assertEquals("Cat",max_string,"Validating Max Method");

        new MaxFinder(num1, num2, num3).find_Max();
        new MaxFinder(fnum1, fnum2, fnum3).find_Max();
        new MaxFinder(str1, str2, str3).find_Max();
    }
/**
 * Checking program gives correct max element
 * when Max element is at 3rd position
 */
    @Test
    void whenMaxAt3Position() {

        Integer num1 =3, num2 =5, num3 =7;
        Integer max_Number = MaxFinder.find_Max(num1, num2, num3);
        Assertions.assertEquals(7,max_Number,"Validating Max Method");

        Float fnum1 =5.99f, fnum2 =3.14f, fnum3 =30f;
        Float max_Float = MaxFinder.find_Max(fnum1, fnum2, fnum3);
        Assertions.assertEquals(30f,max_Float,"Validating Max Method");

        String str1 ="Apple", str2 ="Ball", str3 ="Cat";
        String max_string = MaxFinder.find_Max(str1, str2, str3);
        Assertions.assertEquals("Cat",max_string,"Validating Max Method");

        new MaxFinder(num1, num2, num3).find_Max();
        new MaxFinder(fnum1, fnum2, fnum3).find_Max();
        new MaxFinder(str1, str2, str3).find_Max();
    }
}
