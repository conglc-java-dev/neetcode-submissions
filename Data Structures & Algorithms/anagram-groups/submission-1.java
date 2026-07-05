class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int [] array = new int[26];
            for (char c : str.toCharArray()) {
               array[c-'a']++;
            }
            String key = Arrays.toString(array);
            if(!map.containsKey(key)) 
            map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
