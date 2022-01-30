// https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {
    Queue<Integer> q1;
      Queue<Integer> q2;
    public MyStack() {
        q1= new ArrayDeque<Integer>();
        q2= new ArrayDeque<Integer>();
        
    }
    
    public void push(int x) {
        q1.add(x);
        
    }
    
    public int pop() {
        if(empty())
        {
            return -1;
        }
        while(q1.size()!=1)
        {
            int val = q1.peek();
            q1.remove();
            q2.add(val);
            
        }
        int ans = q1.peek();
        q1.remove();
        while(q2.size()!=0)
        {
            int val=q2.peek();
            q2.remove();
            q1.add(val);
        }
        return ans;
    }
    
    public int top() {
        if(empty())
        {
            return -1;
        }
        while(q1.size()!=1)
        {
            int val = q1.peek();
            q1.remove();
            q2.add(val);
            
        }
        int ans = q1.peek();
        q2.add(ans);
        q1.remove();
        while(q2.size()!=0)
        {
            int val=q2.peek();
            q2.remove();
            q1.add(val);
        }
        return ans;
    }
    
    public boolean empty() {
        return (q1.size()==0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
