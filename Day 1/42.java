class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax)
                    leftMax = height[left];
                else
                    water += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                    water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}
/*
✅ LEETCODE 42 - Trapping Rain Water


⚙️ 2-pointer approach:
- Move the smaller max pointer
- Track leftMax, rightMax
- If current < max → water += (max - height)

⏱ Time: O(n)
🧠 Space: O(1)
*/
