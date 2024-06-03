// Quicksort approach, 1 test case failed
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return recur(nums, 0, nums.length-1, k);
    }
    public int recur(int[] nums, int l, int r, int k){
        if (l >= r){
            return nums[l];
        }
            int flag = l-1;
            int pivot = nums[r];
            for (int j = l ; j < r ; j ++){
                if (nums[j] >= pivot){
                    flag ++;
                    int temp = nums[j];
                    nums[j] = nums[flag];
                    nums[flag] = temp;
                }
            }
            flag ++;
            nums[r] = nums[flag];
            nums[flag] = pivot;
            if ((flag+1-l) < k){
                return recur(nums, flag+1, r, k-(flag-l)-1);
            }
            else if ((flag+1-l) > k){
                return recur(nums, l, flag-1, k);
            }
            else if ((flag +1-l) == k){
                return nums[flag];
            }
            return -1;
    }
}
