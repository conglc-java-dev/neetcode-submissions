class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0; 
        int p1=0;
        int p2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[p1]!=val){
                k++;
                nums[p2]=nums[p1];
                p2++;
            }
            p1++;
        }
        return k ;
    }
}