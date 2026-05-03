class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int L = 0, R = arr.length - k;

        while(L<R){
            int mid = (L+R)/2;

            if (x - arr[mid] > arr[mid+k] - x) {
                L = mid + 1;
            } else {
                R = mid;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = L; i < L + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}