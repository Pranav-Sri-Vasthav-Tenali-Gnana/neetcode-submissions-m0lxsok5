class Solution {
    public int maxProfit(int[] prices) {
        int curmin = prices[0];
        int curprof = 0;
        int maxprof = 0;
        for (int i =1; i<prices.length; i++){
            curmin = Math.min(curmin, prices[i]);
            curprof = prices[i]-curmin;
            maxprof = Math.max(maxprof, curprof);
        }
        return maxprof;
    }
}