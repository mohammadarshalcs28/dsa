class Solution {
    public void rotate(int[][] matrix) {
        int a=matrix.length;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][a-j-1];
                matrix[i][a-j-1]=temp;
            }
        }
        return ;
    }
}