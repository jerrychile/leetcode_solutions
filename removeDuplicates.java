class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i = 0;
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }  
        }
        return i + 1;
    }
}

// Here is the method to returing an Int of how many numbers are in the array that are not duplicates.
// I will add to the file on returning the array without the duplicates
