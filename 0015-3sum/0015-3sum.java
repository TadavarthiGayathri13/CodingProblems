class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;  //here we are skipping

            int l=i+1,r=n-1; //after skipping it will point to next element

            while(l<r) {
                int sum = nums[i]+nums[l]+nums[r];

                if(sum ==0 ) {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l< r && nums[l]==nums[l+1]) l++; //skipping left side elements
                    while(l<r && nums[r]== nums[r-1]) r--; //skipping right side elements

                    l++;
                    r--;  // this code will help us to store unique triplets

                }
                else if(sum >0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return res;
    }
}