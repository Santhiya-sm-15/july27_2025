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