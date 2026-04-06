class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0 ; i<n ; i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int num1 = nums[i];
            int l  = i + 1 ;
            int r = n - 1;

            while(l<r){
                int sum = nums[l] + nums[r]+num1;
                if (sum==0){
                     List<Integer> ans = new ArrayList<>();
                     ans.add(num1);
                     ans.add(nums[l]);
                     ans.add(nums[r]);
                     result.add(ans);
                     l++;
                     while(l<r && nums[l]==nums[l-1]){
                        l++;
                     }
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;
    }
}
