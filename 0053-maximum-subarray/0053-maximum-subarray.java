class Solution {
    public int maxSubArray(int[] nums) {
       int curr = nums[0];
        int best = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // إمّا نمدّد المجموع السابق أو نبدأ من الصفر بهذا العنصر
            curr = Math.max(nums[i], curr + nums[i]);
            best = Math.max(best, curr);
        }

        return best; 
    }
}