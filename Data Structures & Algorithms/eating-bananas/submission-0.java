class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        for (int i : piles) {
            right = Math.max(right, i);
        }
        while(left<right){
            int mid = (left + right) / 2;
            int hours = 0;
            for(int i=0; i<piles.length; i++){
                hours += (piles[i] + mid - 1) / mid;
            }
            if(hours <= h){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}