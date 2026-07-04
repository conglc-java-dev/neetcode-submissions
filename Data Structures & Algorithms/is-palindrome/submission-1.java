class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int leftPointer = 0;
        int rightPointer = s1.length()-1;
       
        while(leftPointer < rightPointer){
            if(s1.charAt(leftPointer)!=s1.charAt(rightPointer)){
                 return false; 
            }
           
            leftPointer ++;
            rightPointer --; 
            
        }
        return true; 
    }
}
