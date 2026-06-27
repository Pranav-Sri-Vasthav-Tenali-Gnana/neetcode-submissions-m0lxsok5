class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(nums);

        backtrackSubset2(nums, ansList, current, 0);

        return ansList;
    }

    public static void backtrackSubset2(int[] arr, List<List<Integer>> ansList, List<Integer> current, int index) {

        ansList.add(new ArrayList<> (current));

        for(int i = index; i<arr.length; i++){
            if(i>index && arr[i] == arr[i-1]){
                continue;
            }

            // add
            current.add(arr[i]);

            //explore
            backtrackSubset2(arr, ansList, current, i+1);

            //remove
            current.remove(current.size()-1);
        }
    }
}