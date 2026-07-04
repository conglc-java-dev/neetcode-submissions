class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        int leftPointer = 0;
        int rightPointer = chars.length-1;
        while(leftPointer < rightPointer){
            if(chars[leftPointer] != chars[rightPointer]){
                 return false; 
            }
           
            leftPointer ++;
            rightPointer --; 
            
        }
        return true; 
    }
}
