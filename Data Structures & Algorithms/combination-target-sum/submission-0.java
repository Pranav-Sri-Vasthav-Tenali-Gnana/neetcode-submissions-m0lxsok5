class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        int sum = 0;

        backtrackFun(candidates, target, ansList, current, sum , 0);

        return ansList;
    }

    public static void backtrackFun(int[] arr, int target, List<List<Integer>> ansList, List<Integer> current, int sum, int index) {
        if(sum == target){
            ansList.add(new ArrayList<> (current));
            return;
        }

        if(sum>target){
            return;
        }

        for(int i = index; i<arr.length; i++){

            sum += arr[i];
            current.add(arr[i]);

            backtrackFun(arr, target, ansList, current, sum , i);

            current.remove(current.size()-1);
            sum-=arr[i];
        }
    }
}