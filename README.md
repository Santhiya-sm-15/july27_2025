# july27_2025
The problem that i solved today in leetcode

You are given a 2D matrix mat[][] of size n x m. The task is to modify the matrix such that if mat[i][j] is 0, all the elements in the i-th row and j-th column are set to 0.

Code:
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int x:rows)
        {
            for(int i=0;i<m;i++)
                mat[x][i]=0;
        }
        for(int x:cols)
        {
            for(int i=0;i<n;i++)
                mat[i][x]=0;
        }
    }
}
