package com.abhi.max;
/**
 * MaxFinder -- Finding Maximum value using 
 *              Generic method 
 *
 * @author Abhishek Shigavan
 */
public class MaxFinder {
/**
 * This method takes generic element
 * & compare it by using compareTo()
 * & returns max element
 *
 * @param element1
 * @param element2
 * @param element3
 * @param <E>
 * @return max element
 */
    public static <E extends Comparable<E>> E find_Max(E element1, E element2, E element3) {

        //setting 1st element as max
        E max_Element = element1;

        //comparing 2nd & 3rd no with max using compareTo()
        if(element2.compareTo(max_Element)>0){
            max_Element = element2;
        }
        if(element3.compareTo(max_Element)>0){
            max_Element = element3;
        }

        //printing result
        System.out.printf("Max between %s, %s, %s is %s \n",element1, element2, element3, max_Element);
        return max_Element;
    }

    public static void main(String[] args) {

        //for Integer
        Integer num1 =5, num2 =3, num3 =7;
        MaxFinder.find_Max(num1, num2, num3);

        //for Float
        Float fnum1 =5.99f, fnum2 =30f, fnum3 =3.14f;
        MaxFinder.find_Max(fnum1, fnum2, fnum3);

        //for String
        String str1 ="Dog", str2 ="Monkey", str3 ="Cat";
        MaxFinder.find_Max(str1, str2, str3);
    }
}
