class Solution {
    public int[] amountPainted(int[][] paint) {
        boolean[] lookuptable = new boolean[50000];
        Arrays.fill(lookuptable, false);
        int[] result = new int[paint.length];
        int start = -1;
        int end =-1;
        int work = 0;
        for (int i = 0 ; i < paint.length ; i ++){
            start = paint[i][0];
            end = paint[i][1];
            for (int k = start ; k < end ; k ++){
                if (lookuptable[k] == false){
                    work++;
                    lookuptable[k] = true;
                }
            }
            result[i] = work;
            work = 0;
        }
        return result;
        }
}
