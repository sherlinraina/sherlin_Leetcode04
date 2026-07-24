class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<matrix.length; i++)
        {
            int mincol = 0;
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][j]<matrix[i][mincol])
                {
                    mincol = j;
                }
            }
            boolean lucky = true;
            for(int k=0; k<matrix.length; k++)
            {
                if(matrix[k][mincol]>matrix[i][mincol])
                {
                    lucky=false;
                    break;
                }
            }
            if(lucky)
            {
                ans.add(matrix[i][mincol]);
            }
        }
        return ans;
    }
}