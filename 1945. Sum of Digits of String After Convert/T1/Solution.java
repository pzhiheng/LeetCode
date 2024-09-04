class Solution {
    public int getLucky(String s, int k) {
        if (k <= 0) {
            return 0;
        }
        char[] array = s.toCharArray();
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] - 'a' + 1;
            System.out.println(result[i]);
        }
        int ans = 0;
        for (int n : result){
            if (n >= 10){
                ans =  ans + n % 10;
                ans = ans + n /10;
            }
            else{
                ans = ans + n;
            }
        }
        System.out.print(ans);
        if (k == 1){
            return ans;
        }
        System.out.print(ans);
        for (int i = 1 ; i < k ; i ++){
            ans = fun(ans);
        }
        return ans;


    }

    public int fun(int num) {
        int result = 0;
        while (num > 0) {
            result = result + num % 10;
            num = num / 10;

        }
        System.out.print(result);
        return result;

    }
}
