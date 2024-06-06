class Solution {
    public int missingElement(int[] nums, int k) {
        int result = nums[0]-1;
        int i = 0;
        int count = 0;
        while (count < k && i < nums.length){
            result ++;
            if (nums[i] == result){
                i ++;
            }
            else{
                count++;
            }
        }
        if (count == k){
        return result;
        }
        else {
            while (count < k){
                result ++;
                count ++;
            }
            return result;
        }
    }
}
