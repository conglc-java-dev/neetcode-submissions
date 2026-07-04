class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result = new HashMap<>();
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++){
            int b = target - nums[i];
            if(!result.containsKey(b)){
                result.put(nums[i], i);
            }
            else {
                output[0]= result.get(b);
                output[1]= i;
                return output  ; 
            }
              
        }
       return output;
}

}
