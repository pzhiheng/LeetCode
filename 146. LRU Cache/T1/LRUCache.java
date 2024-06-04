class LRUCache {
    HashMap<Integer, Integer> map;
    int size;
    int Capacity;
    ArrayDeque<Integer> queue;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        size = 0;
        Capacity = capacity;
        queue = new ArrayDeque<>();
    }
    
    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        queue.remove(key);
        queue.offer(key);
        return map.get(key);
        
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            map.put(key, value);
            queue.remove(key);
            queue.offer(key);
        }
        else if (size >= Capacity){
            map.remove(queue.poll());
            queue.offer(key);
            map.put(key, value);
        }
        else{
            map.put(key, value);
            queue.offer(key);
            size++;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
