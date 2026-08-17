class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0||s.length()==1) return true;
         String lower = s.toLowerCase();
         char[] arr = lower.toCharArray();
         Stack <Character> st=new Stack<>();
        int n= arr.length;
        for (int i=0;i<n;i++){
            if (Character.isLetterOrDigit(arr[i])) {
                st.push(arr[i]);
            }
        }
        char[] arr2 = new char[st.size()];
        int i=0;
        while(st.size()>0){
            arr2[i++]=st.pop();
        }
       
        int low=0;
        int high=arr2.length-1;
        while(high>low){
            if(arr2[low]==arr2[high]){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}