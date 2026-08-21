/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
import java.lang.reflect.Array;
import java.util.*;
class MinStack {
    Stack<Integer> stack; 
    Stack<Integer> mIntegers;

    public MinStack() {
        stack = new Stack<Integer>() ;
        mIntegers = new Stack<Integer>() ;
    }
    
    public void push(int value) {
        stack.push(value);
        if(mIntegers.isEmpty() || value <= mIntegers.peek()){
            mIntegers.add(value);
        } 
    }

    
    public void pop() {
        if(stack.isEmpty()) return;
        int poppedVal= stack.pop();
        if (poppedVal == mIntegers.peek()){
            mIntegers.pop();
        }
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
       return mIntegers.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 * 0725
 * 
 * [0]
 */
// @lc code=end


