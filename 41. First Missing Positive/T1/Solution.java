class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums.length ; i ++){
            set.add(nums[i]);
        }
        boolean b = true;
        int flag = 1;
        while (true){
            if (!set.contains(flag)){
                return flag;
            }
            flag ++;
        }
    }
}
