import java.util.Arrays;
public class LeetCode {


    
    public static void main(String[] args) {
       
       int[] arr1 = new int[]{1,2,3,4};
       
       System.out.println(Arrays.toString(twoSum(arr1, 5)));
    }
        
        public static int[] twoSum(int[] arr, int target){
        
            int returnArray[] = new int[2];
            
            for(int j1 = 0; j1 <= arr.length - 1; j1++){
                for(int q2 = 1; q2 <= arr.length - 1; q2++){
                    if(arr[j1] + arr[q2] == target){
                        returnArray[1] = j1;
                        returnArray[0] = q2;
                        
                    }// end if loop
                }// end nest for loop
                
            } // end of for loop
        
            return returnArray;
        }
      
}

/*

Takes the element of the firsy array(Taken from the first for loop)
and adds to to every element after that(2nd for loop) and returns the indices of where
the numbers that add up to the target are.

*/
