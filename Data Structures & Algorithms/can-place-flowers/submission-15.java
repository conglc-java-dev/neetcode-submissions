class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length) {
            if (n == 0)
                return true;
            if (flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] != 1)
                && (i == 0 || flowerbed[i - 1] != 1)) {
                n = n - 1;
            }
            i += 2;
        }
        return n == 0;
    }
}