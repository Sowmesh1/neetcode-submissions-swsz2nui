class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set = new HashSet<>();

      for(int i : nums){
        set.add(i);
      }
      int longest = 0;
      int length = 0;
      for(int num : nums){

        if(!set.contains(num-1)){
            length=1;

            while(set.contains(num+length)){
                length++;
            }
            longest = Math.max(longest,length);
        }
      }
      return longest;
       } 
    }

