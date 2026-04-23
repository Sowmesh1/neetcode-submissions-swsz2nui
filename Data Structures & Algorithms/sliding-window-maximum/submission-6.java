class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> output  = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();

        int left = 0 ,right = 0;

        while (right < nums.length){

            while(!q.isEmpty() && nums[q.peekLast()] < nums[right]){
               q.pollLast();
            }
            q.offerLast(right);

           if(left > q.peekFirst()){
                q.pollFirst();
           }

           if((right+1)>=k){
            output.add(nums[q.peekFirst()]);
            left++;
           }
            right++;

        }
        int[] result = new int[output.size()];
        for(int i=0;i<output.size();i++){
            result[i]=output.get(i);
        }
        return result;
    }

}
