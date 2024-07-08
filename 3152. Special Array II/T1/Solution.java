class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] array = new boolean[nums.length-1];
        int num = -2;
        for (int i = 0 ; i < array.length ; i ++){
            array[i] = !((nums[i] & 1) == (nums[i+1] & 1));
        }
        boolean[] result = new boolean[queries.length];
        int start = 0;
        int end = 0;
        for (int i = 0 ; i < result.length ; i ++){
            start = queries[i][0];
            end = queries[i][1];
            result[i] = true;
            for (int k = start ; k < end ; k ++ ){
                if(!array[k]){
                    result[i] = false;
                    break;
                }
            }
        }

        return result;
        
        
    }
}
