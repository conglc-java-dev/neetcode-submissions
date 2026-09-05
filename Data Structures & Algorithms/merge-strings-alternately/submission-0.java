class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 =0; 
        int w2=0;
        int maxlength = Math.max(word1.length(),word2.length());
        StringBuilder res = new StringBuilder() ;
        for(int i=0;i<maxlength;i++){
            if(w1<word1.length()) res.append(word1.charAt(w1));
            if(w2<word2.length()) res.append(word2.charAt(w2));
            w1 ++;
            w2 ++ ;
        }
        String result = res.toString(); 
        return result;
    }
}