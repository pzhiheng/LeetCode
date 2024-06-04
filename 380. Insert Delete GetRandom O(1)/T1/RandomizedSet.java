class RandomizedSet {
    HashSet<Integer> set;

    public RandomizedSet() {
        set = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        Integer[] array = set.toArray(new Integer[set.size()]); 
        Random ran = new Random();
        return array[ran.nextInt(array.length)];
    }
}
