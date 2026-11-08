class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !set.contains(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
    
        // Duyệt qua từng key để lấy value
        for (int t1 = 0; t1 < t.length(); t1++) {
            if (t.charAt(t1) != map.getOrDefault(s.charAt(t1),' '))
                return false;
        }
        return true;
    }
}