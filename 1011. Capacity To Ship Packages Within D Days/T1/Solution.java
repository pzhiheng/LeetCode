class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
        for (int weight: weights){
            sum += weight;
            max = Math.max(max,weight);
        }
        int l = max;
        int h = sum;
        while (l <= h){
            int mid = (l + h)/2;
            if (check(weights, days, mid)){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;

        
    }
    public boolean check(int[] weights, int days, int cap){
        int sum = 0;
        int day = 1;
        for (int weight: weights){
            sum = sum + weight;
            if (sum > cap){
                day++;
                sum = weight;
            }
        }
        return day <= days;
    }
}
