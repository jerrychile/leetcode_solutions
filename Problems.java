/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;



import java.util.*;
public class Problems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

    }
    
    
    // This method takes two arrays and finds the absolute smallest difference there is between the rest of the numbers. 
    // To run, copy and paste commented code out below and add it to the main class. Feel free to change the array sizes and numbers for your
    // own test cases.
    
      public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    
		int[] tempNumbers = {arrayOne[0], arrayTwo[0]};
		int tempNumber = Math.abs(arrayOne[0] - arrayTwo[0]);
		int[] currNumbers = new int[2];
		currNumbers[0] = arrayOne[0];
                currNumbers[1] = arrayTwo[0];
		for(int i = 0 ; i < arrayOne.length ; i++){
			for(int j = 0; j < arrayTwo.length ; j++){
				if(Math.abs(arrayOne[i] - arrayTwo[j]) < tempNumber){
						tempNumber = Math.abs(arrayOne[i] - arrayTwo[j]);
						currNumbers[0] = arrayOne[i];
						currNumbers[1] = arrayTwo[j];
				}
			}
				
		}
		
                
//        int arr1[] = {0,22,34};
//        int arr2[] = {1,20,3};
//        System.out.println(Arrays.toString(smallestDifference(arr1, arr2)));
		
		
    return currNumbers;
  }
    
}
