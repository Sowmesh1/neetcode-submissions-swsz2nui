//O(1) apce solution with two pointers

class Solution {
    public int trap(int[] height) {
        if(height.length==1) return 0;

        int n = height.length;
        int l=0;
        int r=n-1;
        int maxL=0;
        int maxR=0;
        int result=0;

        while(l<r){
            if(height[l]<height[r]){

                if(height[l]>=maxL){
                    maxL = height[l];
                }
                else{
                    result+=maxL - height[l];
                    
                }
                l++;
                
            }
            else{
                if(height[r]>=maxR){
                     maxR = height[r];
                }
                else{
                    result+=maxR - height[r];
                }
                r--;
            }
        }
       return result;
        }

    }

