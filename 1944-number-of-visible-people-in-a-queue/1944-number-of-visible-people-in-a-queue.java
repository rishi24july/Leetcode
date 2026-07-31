class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int size=arr.length;
        int [] ans=new int[size];
        Stack<Integer> st=new Stack<>();
        ans[size-1]=0;
        st.push(arr[size-1]);
        for(int i=size-2;i>=0;i--){
            int count=0;
            while(st.size()>0&&st.peek()<arr[i]){
                st.pop();
                count++;
            }
            if(st.size()>0){
                count++;
            }
            st.push(arr[i]);
            ans[i]=count;
        }
        return ans;
    }
}