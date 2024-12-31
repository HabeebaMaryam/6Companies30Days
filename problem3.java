/*Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

Test cases are designed so that the answer will fit in a 32-bit integer.
*/
class Solution {
    public int minMoves2(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int target = nums[n/2];
        for(int i = 0; i < nums.length; i++){
            ans += Math.abs(target - nums[i]);
        }
        return ans;
    }
}
