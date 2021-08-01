//This question is asked by Google.

/* A ball is dropped into a special Galton board where at each level in the
 board the ball can only move right or down. Given that the Galton board has M rows and N columns,
 return the total number of unique ways the ball can arrive at the bottom right cell of the Galton board.*/

public class D70_GaltonBoard
{
    public static int GaltonBoard(int m, int n) {
        int[][]dp=new int[m][n];
        for(int i=0;i<dp.length;i++)
            dp[i][0]=1;
        for(int i=0;i<dp[0].length;i++)
            dp[0][i]=1;

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int m=2,n=2;
        int result=GaltonBoard(m,n);
        System.out.println(result);
    }
}

// Time complexity : O(n2)
// Space complexity : O(1); because the table's size stays constant no matter how large nn is.