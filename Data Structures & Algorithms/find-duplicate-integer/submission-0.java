class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        int slow2=0;

        while(true){
            fast=nums[nums[fast]];
            slow=nums[slow];
            if(slow==fast){
                break;
            }
        }

        while(true){
            slow=nums[slow];
            slow2=nums[slow2];
            if(slow2==slow){
                return slow2;
            }
        }
    }
}
