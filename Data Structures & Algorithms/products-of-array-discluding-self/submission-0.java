class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output =new int [nums.length];
        int[] left= new int [nums.length];
        
        int [] right = new int [nums.length];
         for(int i=0;i<nums.length;i++){
             if(i==0) left[0] =1;
             else{
                 left[i] = left[i-1]*nums[i-1];
             } 
            }  
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1) right[j]=1;
            else
            right[j]= right[j+1]*nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            output[k]=left[k]*right[k];
        }
        System.out.println("'left'");
        for(int x :right){
            System.out.println(x);
        }

        
        return output;
    }
}  
