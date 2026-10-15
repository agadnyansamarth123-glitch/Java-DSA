public class N_Queens {


    public static void printBoard(char arr[][])
    {   int n =arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j= 0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static boolean isSafe(char board[][] ,int row , int col)
    {   int n= board.length;
        //vertical
        for(int i = row-1;i>=0;i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // left diagonal
        for(int i = row-1, j = col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        // right diagonal 
        for (int i = row-1,j=col+1; i>=0 && j<n ;i--,j++)
        {
            if(board[i][j]=='Q')
            {
              return false;
            }       
        }

        return true;
    }

    public static void nQueens(char board[][], int row)
    {
        if(row==board.length)
        {
            System.out.println("----chess Board----");
            printBoard(board);
            return ;
        }
        for(int j= 0;j<board.length;j++)
        {
            if(isSafe(board,row, j))
            {
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'X';
            }
         }
        
    }
    public static void main(String[] args) {
        int n=10;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j= 0;j<n;j++)
            {
                board[i][j]='X';
            }
        }

        nQueens(board, 0);

    }
}
