class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (
                nums[i] > 0 &&
                nums[i] <= n &&
                nums[nums[i] - 1] != nums[i]
            ) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return n + 1;
    }
}
/*
✅ QUICK NOTES: Leetcode 41 - First Missing Positive

Goal: Find the smallest missing positive integer in O(n) time & constant space.

1️⃣ Step 1: Place each number x (1 <= x <= n) at index x-1.
   ↪ Use: while(nums[i] in range && not in correct pos) → swap

2️⃣ Step 2: Scan from left, return first i where nums[i] != i+1
   ↪ That i+1 is the missing positive number.

⚠️ Condition: nums[nums[i] - 1] != nums[i]
   → Avoids infinite swaps from duplicates.

⏱ Time: O(n)
🧠 Space: O(1)
*/
