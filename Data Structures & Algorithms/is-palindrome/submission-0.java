class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        int leftPointer = 0;
        int rightPointer = chars.length-1;
        int mid = chars.length/2;
        while(leftPointer < mid){
            if(chars[leftPointer] != chars[rightPointer]){
                 return false; 
            }
           
            leftPointer ++;
            rightPointer --; 
            
        }
        return true; 
    }
}
