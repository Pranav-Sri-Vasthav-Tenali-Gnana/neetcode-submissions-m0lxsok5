class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<tokens.length; i++){
            switch(tokens[i]){
                case "+": stack.push(stack.pop() + stack.pop()); break;
                case "-": int a = stack.pop(); int b = stack.pop(); stack.push(b-a); break;
                case "*": stack.push(stack.pop() * stack.pop()); break;
                case "/": int x = stack.pop(); int y = stack.pop(); stack.push(y/x); break;
                default: stack.push(Integer.parseInt(tokens[i])); break;
            }
        }
        return (stack.pop());
    }
}