

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Find original zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Set rows and columns to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
























// class Solution {
//     public void setZeroes(int[][] matrix) {
//         for (int i=0;i<matrix.length;i++){
//             for (int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){
//                     flagRow(matrix,i);
//                     flagCol(matrix,j);
//                 }
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++) {
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//     }
//     public void flagRow(int[][] matrix, int row ){
//         for(int j=0;j<matrix[0].length;j++){
//             if(matrix[row][j]!=0){  
//                 matrix[row][j] =-1;
//             }
//         }
//     }
//     public void flagCol(int[][] matrix, int col){
//         for(int i=0;i<matrix.length;i++){
//             if(matrix[i][col] !=0){  
//                 matrix[i][col] =-1;
//             }
//         }
//     }
// }