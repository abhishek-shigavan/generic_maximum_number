package com.abhi.max;
/**
 * MaxFinder -- Finding Maximum Integer, Floating number 
 *              String between each 3  values
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
 * This method takes 3 Strings & find 
 * maximum String using compareTo()
 *
 *
 * @return max String
 */ 	
	public static String find_MaxString(String str1, String str2, String str3) {
       
		//setting 1st string as max
        String max_String = str1;
       
        //comparing 2nd & 3rd string with max using compareTo()
        if(str2.compareTo(max_String)>0){
            max_String = str2;
        }
        if(str3.compareTo(max_String)>0){
            max_String = str3;
        }
       
        //printing result
        System.out.printf("Max String between %s, %s, %s is %s \n",str1, str2, str3, max_String);
        return max_String;
    }
/**
 * This method declares 3 integer, floating
 * number & strings each
 * Calls methods using these no & string as argument
 * to find max between them.
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
        
        //Strings
    	String str1 ="Dog", str2 ="Monkey", str3 ="Cat";
        String maxString = find_MaxString(str1, str2, str3);
    }
}
