class Solution {
    public int largestRectangleArea(int[] arr) {
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
}