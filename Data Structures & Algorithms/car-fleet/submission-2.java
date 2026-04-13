class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pair = new int[n][2];
         Stack<Double> stack = new Stack<>(); 

        for(int i = 0;i < n;i++){
           pair[i][0] = position[i];
             pair[i][1] = speed[i];
        }
         
         Arrays.sort(pair , (a,b) -> a[0]-b[0]);
      for(int i=n-1 ; i>=0;i--){

        int p = pair[i][0];
        int s = pair[i][1];
        
        double time = (double)(target - p) / s;
        stack.push(time);
        if(stack.size()>=2 && stack.peek() <= stack.get(stack.size()-2)){
            stack.pop();
        }
      }
      return stack.size();
    }
}
