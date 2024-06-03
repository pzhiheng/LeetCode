class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> pair = new HashMap<>();
        for (int i = 0 ; i < magazine.length() ; i ++){
            char chart = magazine.charAt(i);
            if (pair.containsKey(chart)){
                pair.put(chart, (pair.get(chart)+1));
            }
            else{
                pair.put(chart, 1);
            }
        }
        System.out.println(pair.toString());
        for (int i = 0 ; i < ransomNote.length() ; i ++){
            char a = ransomNote.charAt(i);
            if (!pair.containsKey(a) || pair.get(a) == 0){
                return false;
            }
            else{
                pair.put(a, (pair.get(a))-1);
            }
        }
        return true;
        
    }
}
