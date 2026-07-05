class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while (leftPointer < rightPointer) {
            char leftChar = s.charAt(leftPointer);
            char rightChar = s.charAt(rightPointer);

            if (!Character.isLetterOrDigit(leftChar)) {
                leftPointer++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                rightPointer--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
