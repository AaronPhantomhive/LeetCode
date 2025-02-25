/**
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 10^5
-2^31 <= nums[i] <= 2^31 - 1
0 <= k <= 10^5
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/

// Solution 1
class Solution {
    public void rotate(int[] nums, int k) {
        int nl = nums.length;
        if (nums == null || nl == 0 || k <= 0) {
            return;
        }
        k = k % nl;
        int rotateNo = nl - k;
        int[] result = new int[nl];
        for (int i = 0; i < nl; i++) {
            int num = (rotateNo + nl) % nl;
            result[i] = nums[num];
            rotateNo++;
        }
        System.arraycopy(result, 0, nums, 0, nl);
    }
}

// 简化Solution 1👇
// Solution 2
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, n);
    }
}