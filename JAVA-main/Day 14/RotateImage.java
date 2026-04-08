class Solution { 
    public void reverse(int[][] matrix,int start,int end){
        for(int i=0;i<matrix.length;i++){
            start=0;
            end=matrix.length-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }

    }
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        reverse(matrix,0,n-1);
    }
}