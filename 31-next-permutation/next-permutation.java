class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
 //Find breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
 // If no breakpoint found
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
 // Find next greater element
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }
 // Reverse remaining part
        reverse(nums, ind + 1, n - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}