class Solution {
    public int numSpecial(int[][] mat) {
        
        int specials = 0;

        for (int i = 0; i < mat.length; i++) {
            
            int index = Row(mat, i);
            if (index >= 0 && Column(mat, i, index))
                specials++;
        }

        return specials;
    }

    private int Row(int[][] mat, int i) {
        int index = -1;

        for (int j = 0; j < mat[0].length; j++) {

            if (mat[i][j] == 1) {
                if (index >= 0)
                    return -1;
                else
                    index = j;
            }
        }

        return index;
    }

    private boolean Column(int[][] mat, int i, int index) {

        for (int j = 0; j < mat.length; j++) {
            if (mat[j][index] == 1 && j != i)
                return false;
        }

        return true;

    }

}