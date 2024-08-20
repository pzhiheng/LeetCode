class Solution {
    public int minSteps(int n) {
        if (n == 1){
            return 0;
        }
        return dyn(n,1,1,1);
        
    }
    public int dyn(int n, int count, int num, int board){
        if (board > n || num > n){
            return Integer.MAX_VALUE;
        }
        if (board == n){
            return count;
        }
        if (num == board){
            return dyn(n, count +1, num, board + num);
        }
        int copy = dyn(n, count +1, board, board);     
        int paste = dyn(n, count +1, num, board + num);   
        if (copy > paste){
            return paste;
        }
        return copy;
    }
}
