class Solution {
    public int removeDuplicates(int[] nums) {
           Set<Integer> set = new  LinkedHashSet<>();
           int i =0; 
           for(int j=0;j<nums.length;j++){
              if(!set.contains(nums[j])){
                   set.add(nums[j]);
              }
              else {
              
               continue;
              }
           }
           for(int x : set){
             nums[i]=x;
             i++;
           }
           return set.size();
    }
}