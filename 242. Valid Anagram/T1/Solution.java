class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        if (sarray.length != tarray.length){
            return false;
        }
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        for (int i = 0 ; i < sarray.length ; i ++){
            if (sarray[i] != tarray[i]){
                return false;
            }
        }
        return true;
    }
}
