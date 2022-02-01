// https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue {
    //s1 main stack , s2 is helper stack 
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        
        s1.push(x);
    }
    
    public int pop() {
        if(s1.empty())
        {
            return -1;
        }
        while(!s1.empty())
        {
            int val = s1.pop();
            s2.push(val);
        }
        int ans = s2.pop();
        while(!s2.empty())
        {
            int val = s2.pop();
            s1.push(val);
        }
        return ans;
    }
    
    public int peek() {
        if(s1.empty())
        {
            return -1;
        }
        while(!s1.empty())
        {
            int val = s1.pop();
            s2.push(val);
        }
        int ans = s2.peek();
        while(!s2.empty())
        {
            int val = s2.pop();
            s1.push(val);
        }
        return ans;
    }
    
    public boolean empty() {
        return s1.empty();
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
