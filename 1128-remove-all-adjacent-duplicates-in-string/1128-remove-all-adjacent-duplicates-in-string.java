class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int size=s.length();
        for(int i=0;i<size;i++){
            if(st.size()==0) st.push(s.charAt(i));
            else{
                char check=st.peek();
                if(check==s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
       
      StringBuilder sb = new StringBuilder();
while (!st.isEmpty()) {
    sb.insert(0, st.pop());   // har character shuru mein daalo
}

String result = sb.toString();
return result;
    }
}