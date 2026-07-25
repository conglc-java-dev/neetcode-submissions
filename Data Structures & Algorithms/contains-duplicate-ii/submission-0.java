class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>(k);
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                if(set.size()==k) set.remove(nums[i-k]);
                set.add(nums[i]);
            }
            else 
              return true;
        }
        return false;
        
    }
}