

class LRUCache {

class Node{
    int key , val;
    Node prev , next;

    Node(int key , int val){
        this.key = key;
        this.val = val;
    }
}

    int cap;
    HashMap<Integer , Node> cache;
    Node left , right; //left = LRU , right = MRU


    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new HashMap<>();

        left = new Node(0,0);
        right = new Node(0,0);

        left.next = right;
        right.prev = left;

    }

    public void remove(Node node){
         Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev; 
    }

    public void insert(Node node){
        Node prev = right.prev;
        Node next = right;

        prev.next = node;
        node.prev = prev;

        node.next = next;
        next.prev = node;

    }
    

    public int get(int key) {
        if(cache.containsKey(key)){
           Node node = cache.get(key);
           remove(node); // remove from lru
           insert(node); // move to mru

           return node.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }

        Node node = new Node(key,value);
        cache.put(key,node);
        insert(node);

        if(cache.size()  > cap){
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
