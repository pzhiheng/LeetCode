class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0 ; i < strs.length ; i ++){
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String string = new String(array);

            if (!map.containsKey(string)){
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(string, list);
            }
            else{
                map.get(string).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
        
    }
}
