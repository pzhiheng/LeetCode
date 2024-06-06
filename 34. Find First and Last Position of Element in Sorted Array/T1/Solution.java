class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);
        return result;
    }

    private int findLeft(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (l < nums.length && nums[l] == target) {
            return l;
        }
        return -1;
    }

    private int findRight(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (r >= 0 && nums[r] == target) {
            return r;
        }
        return -1;
    }
}
