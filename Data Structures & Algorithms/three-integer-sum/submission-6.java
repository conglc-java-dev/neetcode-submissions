class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output= new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
             int j =i+1;
             int k = nums.length - 1;
            while(j<k)
                if (nums[j] + nums[k] == 0 - nums[i]) {
                    if(!output.contains(List.of(nums[i], nums[j], nums[k])))
                    output.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if (nums[j] + nums[k]< -nums[i])
                j++;
                else
                k--;
            
        }
        return output;
    }
}
