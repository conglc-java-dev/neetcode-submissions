class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int max =0;
        int child =0;
        int cookie =0 ;
        Arrays.sort(g);
        Arrays.sort(s);
        while(child<g.length && cookie < s.length){
            if(s[cookie] >=  g[child]){
                max++;
                child++;
            } 
             cookie ++;
        }
        return max;
    }
}