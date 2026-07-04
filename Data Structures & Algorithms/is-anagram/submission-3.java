class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        if(s.length()!= t.length()) return false; 
        for(char c : s.toCharArray()){
            int i = c - 'a'; 
            a[i]++;
        }
        for(char x : t.toCharArray()){
            int n = x - 'a';
            a[n] --;
        }
        for( int kt : a){
             if(kt!=0)
             return false;
        }
        return true;
    }
}
