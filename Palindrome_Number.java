class Solution {
    public boolean isPalindrome(int x) {
        
        String num1 = Integer.toString(x);
        String num2 = "";
        
        for(int j = num1.length() - 1;j >= 0; j--){
            num2 = num2 + num1.charAt(j);
        }     
            if(num2.equalsIgnoreCase(num1)){
                return true;
            }
        
        return false;
        
        
    }
}

//**
Here is the answer to solution 9 of Leetcode. This takes an int and converts it into a string. After this, I create an empty string called
num2 to hold the reversale of num1. I use a common method I do to reverse strings and created my reversal of num1. Once I got this
I just did a simple if statement to see if they were equal to each other. At first I converted it back to an Iit but couldn't figure it
out. As I was typing this I just realized how to do it and I re-did the program to make its runtime from 14ms to 6ms. The faster code
is down below. I was trying to figure out how to account for a negative number, but just realized a simple if statement to check
in the beginning would be enough and super easy as well.


class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
        
        int num1 = x, num2 = 0;
        while(num1 != 0) {
            int digit = num1 % 10;
            num2 = num2 * 10 + digit;
            num1 /= 10;
        }
        
        if(x == num2){
            return true;
        }
        
        return false;
        
    }
}

*/
