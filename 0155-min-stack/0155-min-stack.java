class MinStack {
          Stack <Integer> obj;
          Stack <Integer> min;
    public MinStack() {
        obj=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int value) {
        obj.push(value);
        if(min.size()==0) min.push(value);
        else min.push(Math.min(value,min.peek()));
        
    }
    
    public void pop() {
        obj.pop();
        min.pop();
        
    }
    
    public int top() {
        return obj.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */