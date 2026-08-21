import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        List<Character> parenStack = new ArrayList<>();
        int head; 
        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                parenStack.add(c);
            }else {
                //check that the last item on the stack is matches 
                head = parenStack.size()-1;
                if (parenStack.isEmpty()){ 
                    return false;
                }
                
                switch (c) {
                    case '}' :
                        
                       if (parenStack.get(head) == '{'){
                        return false;
                       }  
                    case ')' :
                       if (parenStack.get(head) == '('){
                        return false;
                       }  
                    case ']' :
                        
                       if (parenStack.get(head) == '['){
                        return false;
                       }  
                    default:
                     parenStack.remove(head);
                }
            }
            
        }
        return parenStack.isEmpty(); 
    }
}

/*
If the its } check that the last char to be added matches {
*/
// @lc code=end

