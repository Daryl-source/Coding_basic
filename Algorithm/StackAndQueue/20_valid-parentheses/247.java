/**
 * 第一种写法利用字符串的替换，把括号都去掉，如果最后不为空字符串，证明字符串不匹配
 * 时间复杂度O（n）
 * 空间复杂度：因为replace的api里调用了tostring，所以每次都会new一个string对象，算O（n）吧
 */
class Solution {
    public boolean isValid(String s) {
        if (s == null)
            return true;
        else {
            while (s.length() > 0 && (s.indexOf("()") >= 0 || s.indexOf("[]") >= 0 || s.indexOf("{}") >= 0)) {
                s = s.replace("()", "");
                s = s.replace("[]", "");
                s = s.replace("{}", "");
            }
            if (s.length() > 0)
                return false;
            else
                return true;
        }


    }

}

/**
 * 第二种就是常规思路，利用栈，左括号入栈，如果右括号就看栈顶的是不是对应的左括号，不是的话立刻就可以判false。一直处理完string，判断栈是否为空。
 * 时间复杂度 O(N)
 * 空间复杂度 O(N)
 */
class Solution {
    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '{' || array[i] == '[' || array[i] == '(') {
                stack.push(array[i]);

            }
            if (array[i] == '}') {
                if (stack.isEmpty() || stack.peek() != '{')
                    return false;
                stack.pop();
            } else if (array[i] == ')') {
                if (stack.isEmpty() || stack.peek() != '(')
                    return false;
                stack.pop();
            } else if (array[i] == ']') {
                if (stack.isEmpty() || stack.peek() != '[')
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();

    }
}

