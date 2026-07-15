class Solution {
    public int scoreOfString(String s) {
        int [] score = new int[s.length()];
        for(int i=0;i< s.length();i++){
            score[i]= s.charAt(i)-'a'+97;
        }
       
        int tong =0; 
        for(int j=0;j<s.length()-1;j++){
            tong =tong +  Math.abs(score[j]-score[j+1]);
        }
        return tong ;
    }
}