class Task4_8 {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ma = new int[n][m]; 
        
        for(int i = 0; i<m; i++){
            for(int j =0; j<n; j++){
                ma[j][i] = matrix[i][j];
            }
        }

        return ma;
    }
    
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = transpose(matrix);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}