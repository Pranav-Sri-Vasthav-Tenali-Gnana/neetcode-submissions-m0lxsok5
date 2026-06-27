class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrackRec(nums, ansList, current, 0);

        return ansList;
    }

    public static void backtrackRec(int[]arr, List<List<Integer>> ansList, List<Integer> current, int index){
        if(index == arr.length){
            ansList.add(new ArrayList<>(current));
            return;
        }

        // add
        current.add(arr[index]);

        // explore
        backtrackRec(arr, ansList, current, index+1);

        // remove
        current.remove(current.size()-1);

        // explore
        backtrackRec(arr, ansList, current, index+1);
    }
}