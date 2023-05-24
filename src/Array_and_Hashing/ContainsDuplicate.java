package Array_and_Hashing;

import java.util.HashMap;

public class ContainsDuplicate {
//Given an integer array nums, return true if any value appears at least twice
//in the array, and return false if every element is distinct.
//
//
// Example 1:
// Input: nums = [1,2,3,1]
//Output: true
//
// Example 2:
// Input: nums = [1,2,3,4]
//Output: false
//
// Example 3:
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁵
// -10⁹ <= nums[i] <= 10⁹
//
//
// Related Topics Array Hash Table Sorting 👍 9231 👎 1154
    //leetcode submit region begin(Prohibit modification and deletion)
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < nums.length; i ++) {
            if(!mp.containsKey(nums[i])) mp.put(nums[i], 1);
            else return true;
        }
        return false;
    }
//leetcode submit region end(Prohibit modification and deletion)
}
