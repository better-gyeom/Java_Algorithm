import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return answer;
    }
}