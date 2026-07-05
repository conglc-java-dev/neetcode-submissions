class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for (String str : strs) {
            List<Integer> array = new ArrayList<>(Collections.nCopies(26, 0));
            for (char c : str.toCharArray()) {
                array.set(c-'a', array.get(c-'a')+1);
            }
            if(!map.containsKey(array)) 
            map.put(array, new ArrayList<>());
            map.get(array).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
