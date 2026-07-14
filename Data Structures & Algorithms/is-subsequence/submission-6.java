class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s.isEmpty()) return true;
        while(p2<t.length()){
            if(p1==s.length()-1) return true;
            if(s1[p1]== t1[p2]){
                p1++;
                
            }
            p2++;
        }
        return false;
    }
}