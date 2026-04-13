class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L = 1;
        int R = numbers.length;
        while(L<=R){
            if(numbers[L-1]+numbers[R-1] == target){
                return new int[] {L, R};
            } else if (numbers[L-1]+numbers[R-1] > target){
                R--;
            } else {
                L++;
            }
        }
        return new int[] {-1, -1};
    }
}
