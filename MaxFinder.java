package com.abhi.max;
/**
 * MaxFinder -- Finding Maximum number between
 *              3 numbers
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
    public static Integer find_Max(Integer int1, Integer int2, Integer int3) {
        
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
 * This method declares 3 integer
 * number & calling find_Max method
 * by giving 3 number as argument
 *
 * @return No return
 */
    public static void main(String[] args) {

        Integer int1 =0, int2 =1, int3 =4;
        int max = find_Max(int1, int2, int3);
    }
}
