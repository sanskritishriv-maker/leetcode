class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
        
    }
     public boolean solve( char[][]board,int row,int col){
        if(row==9) return true;
    int nr=0;
    int nc=0;
    if(col==8){
        nr=row+1;
        nc=0;
    }
    else{
        nr=row;
        nc=col+1;
    }
    if(board[row][col]!='.'){
        return solve(board,nr,nc);}
    else{
        for(char ch='1';ch<='9';ch++){
            if(isValid(board,row,col,ch)){
                board[row][col]=ch;
            if(solve(board,nr,nc)) return true;
            board[row][col]='.';
           }
          }
    }
    
        return false;
       }
          public boolean isValid(char[][]board,int row,int col,char ch){
        for(int i=0;i<9;i++){
           if(board[i][col]==ch || board[row][i]==ch)
            {
                return false;
           }
        }
           int smi=(row/3)*3;
           int smj=(col/3)*3;
           for(int k=0;k<3;k++){
            for(int j=0;j<3;j++){
                if(board[smi+k][smj+j] == ch){
                    return false;
                    }
            }
           
        }
        return true;
    }
}