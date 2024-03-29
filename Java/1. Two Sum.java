// 167. 两数之和 II - 输入有序数组 同理
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
*/

// solution(i，j遍历Array。查找所有):
// Runtime: 14 ms, faster than 44.57% of Java online submissions for Two Sum.
// Memory Usage: 37 MB, less than 99.56% of Java online submissions for Two Sum.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) { // 这个地方要注意，是j = i + 1, 不能是j = 0 开始
                if (nums[i] + nums[j] == target) {
                    int[] result = new int[]{i,j}; // 167 题在这i+1和j+1就ok
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
