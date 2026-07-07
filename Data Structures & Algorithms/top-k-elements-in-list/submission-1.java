class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else{
                map.put(x,map.get(x)+1);
            }
        }
        List<Integer>[] bucket= new ArrayList[nums.length + 1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer frequency = entry.getValue();
            if(bucket[frequency] == null){
               bucket[frequency] =new ArrayList<>();
            }
           
             bucket[frequency].add(entry.getKey());
        
           
        }
        int [] output =new int[k];
        int cnt=0;
        for(int i= nums.length;i>=1 && cnt <k ;i--){
            if(bucket[i]!=null){
                for(int num : bucket[i]){
                    if(cnt>=k) break;
                    output[cnt]= num;
                    cnt++;
                }
            }
        }
       
    return output;
    }
}
