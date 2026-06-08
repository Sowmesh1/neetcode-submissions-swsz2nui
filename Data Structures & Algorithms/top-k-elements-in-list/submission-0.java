class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            Map<Integer , Integer> count = new HashMap<>();
            for(int num : nums){
                count.put(num , count.getOrDefault(num , 0)+1);
            }    

            List<Integer>[] freq = new ArrayList[nums.length+1];
            for(int i=0;i<nums.length+1;i++){
                 freq[i]=new ArrayList<>();
            }

            for(Map.Entry<Integer,Integer> entry : count.entrySet()){
                //int num = entry.getKey();
                //int index = entry.getValue();
                //freq[index].add(num);
                           freq[entry.getValue()].add(entry.getKey());
            }
            int[] result = new int[k];
            int idx =0;
            for(int i=freq.length-1 ;i>=1  ; i--){
                   for(int num : freq[i]){
                      result[idx++] = num;
                      if(idx==k){
                        return result;
                      }
                   }
            }
            return result;
    }
}
