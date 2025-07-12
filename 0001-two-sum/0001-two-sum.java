// LeetCode template
// Runtime: 1 pass → O(n) time
// Memory : O(n) extra space

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // key   = number in the array
        // value = its index
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If we have already stored the complement,
            // we found the unique answer (problem guarantees one solution)
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }

            // Otherwise remember this number and its index
            // so it can act as the complement for a later element
            seen.put(nums[i], i);
        }

        // According to the problem statement this line is never reached
        throw new IllegalArgumentException("No two‑sum solution");
    }
}
