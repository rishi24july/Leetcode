class Solution {
    public int[] nextGreaterElements(int[] arr) {
             Stack<Integer> st=new Stack<>();
       int size=arr.length;
       int[] arr1=new int[size];
       for (int i=size-1;i>=0;i--){
        st.push(arr[i]);
       }
       for (int i=size-1;i>=0;i--){
        while(st.size()!=0&&st.peek()<=arr[i]){
            st.pop();
        }
        if(st.size()==0){
            arr1[i]=-1;
        }else{
            arr1[i]=st.peek();
        }
        st.push(arr[i]);
       }
       return arr1;
    }
}