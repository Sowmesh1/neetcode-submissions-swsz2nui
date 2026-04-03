class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,List<Character>> rowMap = new HashMap<>();
        Map<Integer,List<Character>> colMap = new HashMap<>();
        Map<Integer,List<Character>> squareMap = new HashMap<>();

        int n = board.length;
        for(int i=0;i<n;i++){
                rowMap.put(i,new ArrayList<Character>());
                colMap.put(i , new ArrayList<Character>());
                squareMap.put(i,new ArrayList<Character>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                char num = board[i][j];
                int boxIndex= (i/3) * 3 + j/3;

                 if(rowMap.get(i).contains(board[i][j]) 
                || colMap.get(j).contains(board[i][j]) 
                 || squareMap.get(boxIndex).contains(board[i][j])  ){
                    return false;
                }
                rowMap.get(i).add(num);

               
                colMap.get(j).add(num);

                
                squareMap.get(boxIndex).add(num);

               
            }
        }
        return true;
    
    }

   
}
