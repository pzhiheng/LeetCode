class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1){
            return 0;
        }
        int mod = k % 2;
        int num = k / 2;
        if (mod == 1){
            num ++;
        }
        int up = kthGrammar(n-1, num);
        if (up == 1){
            if (mod == 0){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
            if (mod == 0){
                return 1;
            }
            else {
                return 0;
            }
        }
        }
        
    }
