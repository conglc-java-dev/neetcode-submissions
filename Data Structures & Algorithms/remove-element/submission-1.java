class Solution {
    public int removeElement(int[] nums, int val) {
        int p1=0;
        int p2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[p1]!=val){
                nums[p2]=nums[p1];
                p2++;
            }
            p1++;
        }
        return p2++ ;
    }
}