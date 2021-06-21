package com.abhi.max;
/**
 * MaxFinder -- Finding Max Using Generic Class
 *              
 *
 * @author Abhishek Shigavan
 */
public class MaxFinder <E extends Comparable <E>>{
    
    //instance variables
    E element1, element2, element3 , max_Element;
    
    //parameter constructor
    public MaxFinder(E element1, E element2, E element3){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public void find_Max(){
        //calling static / Generic method
        max_Element = MaxFinder.find_Max(this.element1, this.element2, this.element3);
    }
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
        //calling Static method internally
        new MaxFinder(num1, num2, num3).find_Max();

        // for Float
        Float fnum1 =5.99f, fnum2 =30f, fnum3 =3.14f;
        new MaxFinder(fnum1, fnum2, fnum3).find_Max();

        //for String
        String str1 ="Dog", str2 ="Monkey", str3 ="Cat";
        new MaxFinder(str1, str2, str3).find_Max();
    }
}
