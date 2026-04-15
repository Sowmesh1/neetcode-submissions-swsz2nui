class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;
        for(int pile : piles){
            max = Math.max(max,pile);
        }

        for(int i=1;i<=max;i++){
            long hours=0;

            for(int pile : piles){
                hours += (pile + i - 1) /i; //ceil function Math.ceil((double)pile / i);
            }
            if(hours<=h){
                return i;
            }
        }
        return max;
    }
}
