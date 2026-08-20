class Solution {
    public int numSpecial(int[][] mat) {
        int scount=0;
        int n = mat.length;
        int k=mat[0].length;
        int rs[] = new int[n];
        int cs[] = new int[k];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(mat[i][j]==1){
                    rs[i]++;
                    cs[j]++;
                }
            }
       }
       for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(mat[i][j]==1 && rs[i]==1 && cs[j]==1){
                    scount++;
                }
            }
       }
       return scount;
    }
}