class Solution {
    public int minimumBuckets(String hamsters) {
        if (hamsters.contains("HHH") || hamsters.equals( "H")){
            return -1;
        }
        if (hamsters.startsWith("HH") || hamsters.endsWith("HH")){
            return -1;
        }

        hamsters = hamsters.replaceAll("H.H", "H");
        char [] array = hamsters.toCharArray();
        int sum = 0;
        for (int i = 0 ; i < array.length ; i ++){
            if (array[i] == 'H'){
                sum ++;
            }
        }
        return sum;

        
    }
}
