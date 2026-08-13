class Solution {
    public boolean validPalindrome(String s) {
        boolean isDelete =false ;
        int l =0;
        int r=s.length()-1;
        while(l<r){
           
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else {
                boolean c =  check(l+1,r,s);
                boolean c1 = check(l,r-1,s);
                if(c==true || c1 == true) return true ; 
                 else 
            return false ;  
            }
           

        } 
        return true; 

    }
    boolean check(int l,int r ,String s){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else 
            return false; 
        }
        return true;
    }
}