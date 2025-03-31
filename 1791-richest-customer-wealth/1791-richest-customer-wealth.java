class Solution {
    public int maximumWealth(int[][] accounts) {
       //person = rol
       //account =col
       int ans = Integer.MIN_VALUE;
       for(int person = 0; person <accounts.length; person++) {
        // when you start a new col take new sum for that row
        int sum=0;
        for(int account = 0; account < accounts[person].length;account++){
            sum+=accounts[person][account];

        }
        // check with overall ans
        if(sum > ans) {
            ans = sum;
        }
       } 
       return ans;
    }
}
// isntead of above for loop we can use enhanced for loop 
//for(int[] ints :accounts) {
//     for(int anInt:ints) {
//         sum += anInt;
//     }
// }