class LRUCache {

    class Node {
        int key, val;
        Node prev, next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> cache;

    private Node left;   // LRU
    private Node right;  // Most recent

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();

        // dummy nodes
        left = new Node(0, 0);
        right = new Node(0, 0);

        left.next = right;
        right.prev = left;
    }

    // remove node from list
    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    // insert node at right (most recent)
    private void insert(Node node) {
        Node prev = right.prev;
        Node next = right;

        prev.next = node;
        node.prev = prev;

        node.next = next;
        next.prev = node;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);

            remove(node);
            insert(node);

            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node node = new Node(key, value);
        cache.put(key, node);
        insert(node);

        if (cache.size() > capacity) {
            // remove LRU (left.next)
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}