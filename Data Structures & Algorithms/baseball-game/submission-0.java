class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<operations.length; i++){
            if(operations[i].charAt(0) == '-' || Character.isDigit(operations[i].charAt(0))){
                stack.push(Integer.parseInt(operations[i]));
            }
            else if (operations[i].equals("C")){
                stack.pop();
            } else if (operations[i].equals("D")){
                stack.push(stack.peek()*2);
            } else if (operations[i].equals("+")){
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            } else {}
        }
        int total = 0;

        while (!stack.isEmpty()){
            total += stack.pop();
        };

        return total;
    }
}