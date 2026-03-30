class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int num2 = target-nums[i];

            if(!map.containsKey(num2)){
                map.put(nums[i],i);
            }
            else{
                result[0]=map.get(num2);
                result[1]=i;
                  return result;
            }
        }
        return result;
    }
}
