class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(asteroids[0]);
        for(int i = 1; i<asteroids.length; i++){
            if(asteroids[i]<0){
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])){
                    stack.pop();
                }

                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(asteroids[i]);
                } else if (stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                } else {}
            }
            else {
                stack.push(asteroids[i]);
            }
        }
        int[] result = new int[stack.size()];
        for(int i = result.length-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
}