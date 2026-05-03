class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mini = weights[0];
        int maxi = 0;
        for (int i : weights) {
            mini = Math.max(mini, i);
            maxi += i;
        }
        while(mini<maxi){
            int mid = (mini+maxi)/2;
            int dayss = 0;
            int sum = 0;
            for (int i = 0; i<weights.length; i++){
                if(sum + weights[i] > mid){
                    dayss +=1;
                    sum = 0;
                }
                sum += weights[i];
            }
            dayss += 1;

            if (dayss <= days){
                maxi = mid;
            } else {
                mini = mid + 1;
            }
        }
        return maxi;
    }
}