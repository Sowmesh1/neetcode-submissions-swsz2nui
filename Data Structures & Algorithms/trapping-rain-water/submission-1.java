//O(n) space solution

class Solution {
    public int trap(int[] height) {
        if(height.length==1){
            return 0;
        }
        int n = height.length;
    int[] maxLeft  = new int[n];
    int[] maxRight = new int[n];
    int result=0;
    maxLeft[1] = height[0];
    for(int i=2;i<n;i++){
maxLeft[i] = Math.max(maxLeft[i-1],height[i-1]);
    }
    maxRight[n-2]=height[n-1];
    for(int i=n-3;i>=0;i--){
        maxRight[i] =Math.max(maxRight[i+1],height[i+1]); 
    }
    for(int i=0;i<n;i++){
        int ans =Math.min(maxLeft[i],maxRight[i]) - height[i];
        if(ans<=0){
            continue;
        }
        else{
            result+=ans;
        }
    }
    return result;
    }
}
