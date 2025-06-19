class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int sumA=0;
        for(int i : nums){
            sumA+=i;
        }
        return sum-sumA;
    }
}

Here we uses the mathematical formulae that is:
1 + 2 + 3 + ... + n = n*(n+1)/2
  if we minus the total with our answer, we got the answer.
