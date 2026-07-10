// LRU Cache
    public class LRUCache extends LinkedHashMap<Integer,Integer>{
    private int capacity;

    public LRUCache(int cap) {
        super(cap,0.75F,true);
        capacity=cap;
    }
    @Override
    protected boolean removeEldestEntry(
        Map.Entry<Integer,Integer>eldest){
            return size()>capacity;
        }
    public int get(int key) {
        return super.getOrDefault(key,-1);
        
    }

