class CustomStack {
    int st[];
    int length;
    public CustomStack(int maxSize) {
        st = new int[maxSize];
        length=0;
    }
    
    public void push(int x) {
        if(length<st.length) st[length++]=x;
    }
    
    public int pop() {
        if(length==0) return -1;

        return st[--length];
    }
    
    
    public void increment(int k, int val) {
        for(int i=0;i<k && i<st.length;i++){
            st[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */