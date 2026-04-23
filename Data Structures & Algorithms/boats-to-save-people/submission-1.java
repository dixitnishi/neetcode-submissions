class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int i = 0;int j = n-1;
        int count = 0;
        while( i <= j){
            int remaining = limit - people[j];
            j--;
            count++;
            if(i<=j && remaining >= people[i]){
                i++;
            }
        }
        return count;
    }
}