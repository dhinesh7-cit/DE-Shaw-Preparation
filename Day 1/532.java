import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Arrays.sort(nums);
        int i = 0, j = 1;
        int count = 0;
        int n = nums.length;

        while (i < n && j < n) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {
                count++;
                i++;
                j++;
                while (j < n && nums[j] == nums[j - 1]) j++;
            }
        }

        return count;
    }
}
