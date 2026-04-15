class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<int[]> stack = new ArrayDeque<>();
        int n = heights.length;
        int maxArea=0;
        for(int i=0 ; i<n ; i++){
            int start = i;

            while(!stack.isEmpty() && heights[i] < stack.peek()[1]){
                  int[] top = stack.pop();
                  int index = top[0];
                  int hei =top[1];
                  maxArea = Math.max(maxArea , hei * (i - index));
                  start = index;
            } 
            
            stack.push(new int[]{start , heights[i]});
             
        }
        while(!stack.isEmpty()){
            int[] top = stack.pop();
            int index = top[0];
            int hei = top[1]; 
             maxArea = Math.max(maxArea , hei * (n - index));
        }
        return maxArea;
    }
}