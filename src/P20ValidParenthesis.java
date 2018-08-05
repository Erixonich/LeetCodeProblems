import java.util.Stack;

public class P20ValidParenthesis {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (!stack.empty()) {
                switch (c) {
                    case (')') : if (stack.pop() != '(') return false;
                    break;

                    case ('}') : if (stack.pop() != '{') return false;
                    break;

                    case (']') : if (stack.pop() != '[') return false;
                    break;

                    default : return false;
                }
            }
            else return false;

        }
        return stack.empty();
    }
}
