class Solution {
    public boolean isPalindrome(String s) {
        char[] array = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase().toCharArray();
        System.out.println(s);
        System.out.println(s.length());
        int length = array.length;
        for (int i = 0 ; i < length/2 ; i++){
            if (array[i] != array[length-i-1]){
                return false;
            }
        }
        return true;
    }
}
