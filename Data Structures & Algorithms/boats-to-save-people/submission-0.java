class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int L = 0;
        int R = people.length-1;
        Arrays.sort(people);
        while(R>=L){
            if (people[L]+people[R] <= limit){
                count +=1;
                L++;
                R--;
            } else {
                count+=1;
                R--;
            }
        }
        return count;
    }
}