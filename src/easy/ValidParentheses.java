package easy;

import java.util.Stack;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:24
 * @description https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            else if(c == ')'){
                if(stack.empty() || stack.peek() != '(')
                    return false;
                else stack.pop();
            }else if(c == '}'){
                if(stack.empty() || stack.peek() != '{')
                    return false;
                else stack.pop();
            }else if(c == ']'){
                if(stack.empty() || stack.peek() != '[')
                    return false;
                else stack.pop();
            }
        }
        return stack.empty();
    }
}
