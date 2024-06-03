class Solution {
    public int[] twoSum(int[] nums, int target) {
        int flag1 = -1;
        int flag2 = -1;
        for (int i = 0 ; i < nums.length ; i++){
            for (int k = i +1 ; k < nums.length ; k++){
                if (nums[i] + nums[k] == target){
                    flag1 = i;
                    flag2 = k;
                }
            }
        }
        int [] array = new int [2];
        array[0] = flag1;
        array[1] = flag2;
        return array;
        
    }
}
