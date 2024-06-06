class AllOne {
  // 15/19 test cases past. Time limit exceeded.

    HashMap<String, Integer> map;
    

    public AllOne() {

        map = new HashMap<>();
    }
    
    public void inc(String key) {
        if (map.containsKey(key)){
            map.put(key, (map.get(key) + 1));
            
        }
        else{
            map.put(key, 1);
        }
    }
    
    public void dec(String key) {
        int count = map.get(key);
        if (count == 1){
            map.remove(key);
            if (map.isEmpty()){
            }
        }
        else{
            map.put(key, --count);
        }
    }
    
    public String getMaxKey() {
        int max = 0;
        int a = -1;
        String value = "";
         for(Map.Entry<String, Integer> entry: map.entrySet()){
            a = entry.getValue();
            if (a > max){
                max = a;
                value = entry.getKey();
            }
         }
         return value;

        
    }
    
    public String getMinKey() {
        int min = Integer.MAX_VALUE-1;
        int a = Integer.MAX_VALUE;
        String value = "";
         for(Map.Entry<String, Integer> entry: map.entrySet()){
            a = entry.getValue();
            if (a < min){
                min = a;
                value = entry.getKey();
            }
         }
         return value;
        
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
