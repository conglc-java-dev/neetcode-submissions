class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        if(s.isEmpty()) return true;
        while(p2<t.length() && p1 < s.length() ){
            if(s.charAt(p1)== t.charAt(p2)){
                p1++; 
            }
            p2++;
        }
        return  p1==s.length();
        
    }
}