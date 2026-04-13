class Solution {
    public int maxArea(int[] height) {
        int total_area = 0;
        int L = 0;
        int R = height.length-1;
        if (height.length < 2) {
            return 0;
        }
        while(L<R){
            int cur_max = Math.min(height[L],height[R])*(R-L);
            total_area = Math.max(total_area, cur_max);
            if(height[L]>height[R]){
                R--;
            } else {
                L++;
            }
        }
        return total_area;
    }
}