class NumArray {
     int [] prefix ;
     int output;
    public NumArray(int[] nums) {
         prefix =new int [nums.length];
         prefix[0]=nums[0];
         for(int i =1;i<nums.length;i++){
            prefix[i] = nums[i]+ prefix[i-1];
         }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefix[right];
        else{
            output= prefix[right]-prefix[left-1];
        }
        return output;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */