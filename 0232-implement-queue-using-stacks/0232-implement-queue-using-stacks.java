class MyQueue {
     Stack<Integer> st;
     Stack<Integer> st2;
    public MyQueue() {
       st=new Stack<>();
       st2=new Stack<>();
    }
    
    public void push(int x) {
       while(st.size()>0){
        st2.push(st.pop());
       }
       st.push(x);
       while(st2.size()>0){
        st.push(st2.pop());
       }

        
    }
    
    public int pop() {
       return st.pop();
    }
    
    public int peek() {
               return st.peek();
        
    }
    
    public boolean empty() {
        if(st.size()!=0) return false;
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */