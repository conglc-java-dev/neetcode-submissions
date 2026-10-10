class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        int n = word.length(), m = abbr.length();
        while (j < m) {
            if (abbr.charAt(j) == '0') return false;
            int number =0;
            while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                number = number * 10 +Character.getNumericValue(abbr.charAt(j));
                j++;
            }
            i=i+number;
            if (i < n && j < m) {
                if (word.charAt(i) == abbr.charAt(j)) {
                    i++;
                    j++;
                } else {
                    return false;
                }
            }
            else{
                break;
            }
        }
        return i==n && j==m;
    }
}