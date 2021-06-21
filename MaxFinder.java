package com.abhi.max;
/**
 * MaxFinder -- Finding Maximum from multiple values
 *              of different data types using Generic
 *
 * @author Abhishek Shigavan
 */
public class MaxFinder <E extends Comparable <E>>{

    //Defining Generic Array
    private E [] inputArray;
    //Generic variable
    E max_Element;

    //parameter constructor
    public MaxFinder(E[] inputArray){
        this.inputArray = inputArray;
    }

    public void find_Max(){
        //calling static / Generic method
        max_Element = MaxFinder.find_Max(this.inputArray);
    }
/**
 * This method takes Array of multiple
 * values & compare elements of Array
 * by using compareTo() & returns max element
 *
 * @return max element
 */
    public static <E extends Comparable<E>> E find_Max(E[] inputArray) {

        //setting 1st element of Array as max
        E max_Element = inputArray[0];

        for(int i =0; i < inputArray.length; i++){
            //Taking element to compare with max
            E elementToCompare = inputArray[i];
            //comparing element
            if(elementToCompare.compareTo(max_Element)>0){
                max_Element = elementToCompare;
            }
        }
        //calling print_Max()
        print_Max(max_Element);

        return max_Element;
    }
 /**
  * This method prints max value
  * @return No return
  */
    public static <E> void print_Max(E max_Value){
        //printing max value
        System.out.println("Max Value : "+max_Value);
    }
/**
 * Defining Array of element for
 * different data types
 * Passes this Array to find_Max()
 * for finding max value
 *
 * @return No return
 */
    public static void main(String[] args) {

        //Array of different data types for multiple value
        Integer[] intArray = {5,2,3,7,9,4,1};
        Float [] floatArray ={3.14f, 5.99f, 30f, 23.43f, 10.43f};
        String[] stringArray ={"Apple", "Watch", "Kite", "Sun", "Ball"};

        new MaxFinder(intArray).find_Max();
        new MaxFinder(floatArray).find_Max();
        new MaxFinder(stringArray).find_Max();
    }
}
