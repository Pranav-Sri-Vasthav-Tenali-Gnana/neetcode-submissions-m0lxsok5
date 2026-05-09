class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && (
                (c == ')' && stack.peek() == '(') ||
                (c == '}' && stack.peek() == '{') ||
                (c == ']' && stack.peek() == '['))){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.size()>0){
            return false;
        } else {
            return true;
        }
    }
}