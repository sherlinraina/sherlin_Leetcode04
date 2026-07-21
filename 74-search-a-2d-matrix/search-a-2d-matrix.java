class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int []r:matrix)
        {
            for(int b:r)
            {
                a.add(b);
            }
        }
        return a.contains(target);
    }
}