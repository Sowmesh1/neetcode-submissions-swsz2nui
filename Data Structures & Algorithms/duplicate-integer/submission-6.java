class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int i : nums){
            if(list.contains(i)){
                return true;
            }
            else{
                list.add(i);
            }
        }
        return false;
    }
}