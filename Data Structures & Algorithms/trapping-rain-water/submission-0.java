class Solution {
    public int trap(int[] height) {
        if (height.length<1){
            return 0;
        }

        int l = 0;
        int r = height.length-1;
        int leftMax=0;
        int rightMax=0;
        int trapped = 0;

        while(l<r){
            if (height[l]<=height[r]){
                if (height[l] >= leftMax){
                    leftMax = height[l];
                }
                else{
                    trapped += leftMax - height[l];
                }
                l += 1;
            } else {
                if (height[r] >= rightMax){
                    rightMax = height[r];
                }
                else{
                    trapped += rightMax - height[r];
                }
                r -= 1;
            }
        }
        return trapped;
    }
}