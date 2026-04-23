class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Arrays.sort(people);
        // int n = people.length;
        // int i = 0;int j = n-1;
        // int count = 0;
        // while( i <= j){
        //     int remaining = limit - people[j];
        //     j--;
        //     count++;
        //     if(i<=j && remaining >= people[i]){
        //         i++;
        //     }
        // }
        // return count;
        // ----------------------------------
        // This logic is just to optimize the sorting instead of Arrays.sort(people) this can be used
        int max = -1;
        for(int num:people){
            max = Math.max(num,max);
        }
        int count[] = new int[max+1];
        for(int num : people){
            count[num]++;
        }

        int i = 1,idx = 0;
        while(idx < people.length){
            while(count[i] == 0){
                i++;
            }
            people[idx++] = i;
            count[i]--;
        }

        //---------------------------------
        int boat = 0;
        int l = 0,r = people.length-1;
        while(l <= r){
            int rem = limit - people[r--];
            boat++;
            if(l <= r && rem >= people[l]) l++;
        }
        return boat;



    }
}