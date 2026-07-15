class Solution {
    public int[] replaceElements(int[] arr) {
 
        int max_right = -1;
        for (int j = arr.length - 1; j >= 0; j--) {
            int currentVal = arr[j];
            arr[j]=max_right;
            max_right =Math.max(max_right,currentVal)  ;
        }
        return arr;
    }
}