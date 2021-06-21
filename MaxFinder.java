package com.abhi.max;
/**
 * MaxFinder -- Finding Maximum Integer & Floating number 
 *              between 3 Integers & Floating numbers
 *
 * @author Abhishek Shigavan
 */
public class MaxFinder {
/**
 * This method takes 3 integer
 * & find maximum no using compareTo()
 *
 *
 * @return max number
 */
	public static Integer find_MaxInteger(Integer int1, Integer int2, Integer int3) {
	        
		//setting 1st no as max
	    Integer max_Number = int1;
	        
	    //comparing 2nd & 3rd no with max
	    if(int2.compareTo(max_Number)>0){
	    	max_Number = int2;
	    }
	    if(int3.compareTo(max_Number)>0){	
	    	max_Number = int3;
	    }
	        
	    //printing result
	    System.out.printf("Max value of %s, %s, %s is %s \n",int1, int2, int3, max_Number);
	    return max_Number;
	}
/**
 * This method takes 3 floating numbers
 * & find maximum using compareTo()
 *
 *
 * @return max floating number
 */    
	public static Float find_MaxFloat(Float num1, Float num2, Float num3) {
        
		//setting 1st floating no as max
        Float max_Number = num1;
        
        //comparing 2nd & 3rd no with max
        if(num2.compareTo(max_Number)>0){
            max_Number = num2;
        }
        if(num3.compareTo(max_Number)>0){
            max_Number = num3;
        }
        
        //printing result
        System.out.printf("Max value of %s, %s, %s is %s \n",num1, num2, num3, max_Number);
        return max_Number;
    }
/**
 * This method declares 3 integer & floating
 * number
 * Calls methods using these no as argument
 * to find max no
 *
 * @return No return
 */
    public static void main(String[] args) {
    	
    	//Integers number
    	Integer int1 =0, int2 =1, int3 =4;
    	int maxInteger = find_MaxInteger(int1, int2, int3);
    	
    	//floating numbers
        Float num1 =5.99f, num2 =3.14f, num3 =30f;
        float maxFloat = find_MaxFloat(num1, num2, num3);
    }
}
