class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sumOfKnown = 0;
        for (Integer num : rolls){
            sumOfKnown += num;
        }
        int sumOfUnknown = mean * (rolls.length + n) - sumOfKnown;
        double meanOfUnknown = (double)sumOfUnknown / (double)n;
        if (meanOfUnknown > 6 || meanOfUnknown < 1){
            return new int[0];
        }
        int[] result = new int[n];
        Arrays.fill(result, (int)meanOfUnknown);
        int left = sumOfUnknown - n * (int)meanOfUnknown;
        for (int i = 0 ; i < left ; i ++){
            result[i] += 1;
        }
        return result;
    }
}
