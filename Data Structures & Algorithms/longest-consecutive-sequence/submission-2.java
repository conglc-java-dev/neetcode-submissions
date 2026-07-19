class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0 ;
        for(int x:nums){
            set.add(x);
        }
        for(Integer x:set){
            if(!set.contains(x-1)){
                int cur=x;
                int  length=1;
                while(set.contains(cur+1)){
                    length++;
                    cur++;
                }
                if(max<length) max=length;

            }
     
            
        }
        return max;
    }
}
