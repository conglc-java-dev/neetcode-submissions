class Solution {
    public int[] replaceElements(int[] arr) {
 
        int[] max_right = new int[arr.length];
        max_right[arr.length-1] = -1;
        for (int j = arr.length - 2; j >= 0; j--) {
            max_right[j] = arr[j + 1] > max_right[j + 1] ? arr[j + 1] : max_right[j + 1];
        }
        return max_right;
    }
}