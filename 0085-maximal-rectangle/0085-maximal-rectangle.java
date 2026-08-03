class Solution {
    public int Area(int[] arr) {
        int n=arr.length;
        int [] lse=new int[n];
        Stack<Integer> st=new Stack<>();
        lse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0&&arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()>0) lse[i]=st.peek();
            else lse[i]=-1;
            st.push(i);
        }
        while(st.size()>0) st.pop();
         int [] nse=new int[n];
         nse[n-1]=n;
         st.push(n-1);
          for(int i=n-2;i>=0;i--){
            while(st.size()>0&&arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()>0) nse[i]=st.peek();
            else nse[i]=n;
            st.push(i);
        }
           int max=0;
           for (int i=0;i<n;i++){
            int m=(nse[i]-lse[i]-1)*arr[i];
            max=Math.max(m,max);
           }
           return max;
    }
public int[][] convertCharToInt(char[][] charMat) {
    int n = charMat.length;
    int m = charMat[0].length;
    int[][] mat = new int[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            mat[i][j] = charMat[i][j] - '0';  // '0'->0, '1'->1
        }
    }
    return mat;
}


    public int maximalRectangle(char[][] matrix) {
        int [][] mat=convertCharToInt(matrix);
          int n=mat.length;
        int m=mat[0].length;
        for(int i=1;i<n;i++){
            for (int j=0;j<m;j++){
                if(mat[i][j]==1) mat[i][j]+=mat[i-1][j];
            }
        }
        int max=0;
        for(int[] row: mat){
            int area= Area(row);
            max=Math.max(area,max);
        }
        return max;
    }
}