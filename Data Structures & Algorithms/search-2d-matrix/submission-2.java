class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l =0;
        int r=n-1;
        int index=-1;
        while(l<=r){
           int mid = (l+r) / 2;

            if(matrix[mid][0]<=target && target <= matrix[mid][m-1]){
            index = mid;
            break;
           }

           else if(matrix[mid][0] > target ){
            r=mid-1;
           }
           else{
           l= mid +1;
           }
    }
    if(index==-1){
        return false;
    }
    int left=0;
    int right =m-1;
    while(left<=right){
          int mid = (left +right)/2;
          if(matrix[index][mid]==target){
            return true;
          }
          else if(matrix[index][mid]<target ){
            left =mid +1;
          }
          else {
            right = mid -1;
          }
          
    }
    return false;
}
}
