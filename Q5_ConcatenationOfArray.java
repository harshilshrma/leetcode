// Date: 28 February 2023

// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
// and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
// Specifically, ans is the concatenation of two nums arrays.
// Return the array ans.

package LeetCode;
public class Q5_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length+ nums.length];
        int n = nums.length;
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}

// ArrayCopy Method's Parameters:
//    1. src denotes the source array.
//    2. srcPos is the index from which copying starts.
//    3. dest denotes the destination array
//    4. destPos is the index from which the copied elements are placed in the destination array.
//    5. length is the length of the subarray to be copied.
