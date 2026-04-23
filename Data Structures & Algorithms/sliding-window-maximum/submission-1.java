class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1){
            return nums;
        }
        int n  =nums.length;
        int[]  res = new int [n-k+1];
        int left = 0;
        int right = k-1;
        int i=0;
        for(right = k-1 ; right < n ; right++ ){
              res[i++] = findMax(nums,left  ,right);
              left++;
        }
        return res;
    }
    private int findMax(int[] nums ,int left  ,int right){
        int max = 0;
        for(int i=left ;i<right+1 ; i++ ){
            max = Math.max(max , nums[i]);
        }
    return max;
    }
}
