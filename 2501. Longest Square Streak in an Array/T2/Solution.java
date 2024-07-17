class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Long> set = new HashSet<>();
        Arrays.sort(nums);
        for (int num : nums){
            set.add((long)num);
        }
        int result = 1;
        for (int i = 0 ; i < nums.length ; i ++){
            int streak = 1;
            long floor = nums[i];
            System.out.println(floor);
            while (set.contains(floor*floor)){
                streak++;
                floor = floor * floor;
            }
            result = Math.max(streak, result);
        }
        if (result == 1){
            return -1;
        }
        return result;
    }
}
