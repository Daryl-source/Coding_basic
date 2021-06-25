class Solution {
    public boolean isValid(String s) {
        /**
         * 利用栈的特性，先进后出，入栈时判断 左括号就放入右括号，右括号的话，如果栈为空，或者取出的栈顶数据和右括号不相等
         * 返回false。
         * Time complexity: O(n)
         * Space complexity: O(n)
         */
        Stack<Character> stack=new Stack<Character>();
        for(char str : s.toCharArray()){
            if(str == '('){
                stack.push(')');
            }else if(str == '['){
                stack.push(']');
            }else if(str == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || str != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
