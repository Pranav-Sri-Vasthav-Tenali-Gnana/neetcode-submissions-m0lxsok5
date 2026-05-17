class Solution {
    public int largestRectangleArea(int[] heights) {
        LinkedList<Integer> stack = new LinkedList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0; i<=heights.length; i++){
            while(!stack.isEmpty() && (i==heights.length || heights[stack.peek()] > heights[i])){
                int current = stack.pop();

                int width=0;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i-stack.peek()-1;
                }
                max = Math.max(max, width*heights[current]);
            }
            stack.push(i);
        }
        return max;
    }
}
