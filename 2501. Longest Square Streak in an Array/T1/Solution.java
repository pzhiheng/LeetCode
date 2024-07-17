class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int result = longestStreak(nums, 0);
        if (result == 1){
            return -1;
        }

        return result;

        
    }
    public int longestStreak(int[] nums, int start){
        if (start >= nums.length){
            return -1;
        }
        else{
            int streak = 1;
            int floor = nums[start];
            int next = nums[start]*nums[start];
            int current = start;
            while(current < nums.length-1){
                current++;
                if (nums[current] == next){
                    floor = next;
                    streak++;
                    next = floor*floor;
                }
                else if (nums[current] > next){
                    break;
                }
            }
            return Math.max(streak, longestStreak(nums, start+1));
        }

    }
    public boolean isSquare(int num){
        int floor = (int)Math.sqrt(num);
        if (floor * floor == num){
            return true;
        }
        return false;
    }
}
