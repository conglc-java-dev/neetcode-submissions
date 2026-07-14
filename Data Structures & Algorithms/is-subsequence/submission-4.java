class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        if(s.isEmpty()) return true;
        for(char x =0;x<t.length();x++){
            if(p1==s.length()-1) return true;
            if(s.charAt(p1)== t.charAt(p2)){
                p1++;
                
            }
            p2++;
        }
        if(p1>s.length()-1) return true ; 
        return false;
    }
}