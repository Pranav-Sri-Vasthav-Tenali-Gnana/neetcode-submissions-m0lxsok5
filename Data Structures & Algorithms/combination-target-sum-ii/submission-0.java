class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        int sum = 0;

        Arrays.sort(candidates);

        backtracksum2(candidates, target, ansList, current, sum, 0);

        return ansList;
    }

    public static void backtracksum2(int[] arr, int target, List<List<Integer>> ansList, List<Integer> current, int sum, int index){
        if(sum == target){
            ansList.add(new ArrayList<>(current));
            return;
        }

        if(sum > target){
            return;
        }

        for(int i = index; i<arr.length; i++){
            if(i>index && arr[i] == arr[i-1]){
                continue;
            }
            
            current.add(arr[i]);
            sum += arr[i];

            backtracksum2(arr, target, ansList, current, sum, i+1);

            current.remove(current.size()-1);
            sum -= arr[i];
        }
    }
}