class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        // boolean array to te=racj the elements
        boolean[] used = new boolean[nums.length];

        backtrackFun(nums, ansList, current, used, 0);
        return ansList;
    }

    private static void backtrackFun(int[] arr, List<List<Integer>> ansList, List<Integer> current, boolean[] used, int index){
        if(index == arr.length){
            ansList.add(new ArrayList<>(current));
            return;
        }

        for(int i=0;i<arr.length; i++){
            if(used[i]){
                continue;
            }

            used[i] = true;

            // add
            current.add(arr[i]);

            //explore
            backtrackFun(arr, ansList, current, used, index+1);

            // remove
            current.remove(current.size()-1);

            used[i] = false;
        }
    }
}