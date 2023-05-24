package Array_and_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
//Given an array of strings strs, group the anagrams together. You can return
//the answer in any order.
//
// An Anagram is a word or phrase formed by rearranging the letters of a
//different word or phrase, typically using all the original letters exactly once.
//
//
// Example 1:
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
// Example 2:
// Input: strs = [""]
//Output: [[""]]
//
// Example 3:
// Input: strs = ["a"]
//Output: [["a"]]
//
//
// Constraints:
//
//
// 1 <= strs.length <= 10⁴
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.
//
//
// Related Topics Array Hash Table String Sorting 👍 15313 👎 439

    //leetcode submit region begin(Prohibit modification and deletion)
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> mp = new HashMap<>();

        for (String s : strs) {
            char[] new_str = s.toCharArray();
            Arrays.sort(new_str);
            String key = String.valueOf(new_str);
            if(!mp.containsKey(key)) mp.put(key, new ArrayList<String>());
            mp.get(key).add(s);
        }

        return new ArrayList<>(mp.values());

    }
//leetcode submit region end(Prohibit modification and deletion)
}
