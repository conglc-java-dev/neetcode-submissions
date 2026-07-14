class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int sLength = s.length()-1;
        int tLength = t.length();
        if(s.isEmpty()) return true;
        while(p2<tLength){
            if(p1==sLength) return true;
            if(s1[p1]== t1[p2]){
                p1++;
                
            }
            p2++;
        }
        return false;
    }
}