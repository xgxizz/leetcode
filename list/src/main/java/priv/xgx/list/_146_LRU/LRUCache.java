package priv.xgx.list._146_LRU;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    class Node {
        Node prev;
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    int capacity;
    Node head;
    Node tail;
    Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node cur = map.get(key);
            remove(cur);
            insert(key, cur.val);
            return cur.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node cur = map.get(key);
            remove(cur);
            cur.val = value;
            insert(key, value);
        } else {
            Node n = new Node(value);
            if (map.size() == capacity) {
                remove(head.next);
                insert(key, value);
            } else {
                insert(key, value);
            }
        }
    }

    public void insert(int k, int v) {
        Node node = new Node(v);
        Node pr = tail.prev;
        node.prev = pr;
        node.next = tail;
        tail.prev = node;
        pr.next = node;
        map.put(k, node);
    }

    public void remove(Node node) {
        Node pr = node.prev;
        Node nxt = node.next;
        pr.next = nxt;
        nxt.prev = pr;
        map.remove(node.val);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        int i = lruCache.get(1);
        System.out.println(i);
        lruCache.put(2, 2);
        int ii = lruCache.get(2);
        System.out.println(ii);
        lruCache.put(3, 3);
    }
}
