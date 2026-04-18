class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int l=0;
        int r=n-1;
        int mid= (l+r)/2;
        int min = nums[mid];
        while(l<=r){
        mid = (l+r)/2;
        if(nums[l]<nums[r]){
            return Math.min(min,nums[l]);
        }
        min = Math.min(min , nums[mid]);
        if(nums[mid]>=nums[l]){
            l=mid+1;
        }
        else{
            r=mid-1;

        }
        }
        return min;
    }
}
