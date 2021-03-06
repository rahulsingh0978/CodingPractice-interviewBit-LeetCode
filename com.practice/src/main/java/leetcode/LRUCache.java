package leetcode;

import java.util.HashMap;

public class LRUCache {
	class Node{
		int val ;
		int key;
		Node next,prev;
		
		
	}
	HashMap<Integer,Node> map = new HashMap();
    int capacity;
    Node head;
    Node tail;
    
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev=head;
        head.prev=null;
        tail.next=null;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node ==null) {
        	return -1;
        }
        this.removeDll(node);
        this.addDll(node);
        return node.val;
    }
    
    public void put(int key, int value) {
    	Node node = map.get(key);
    	if(node == null) {
    		Node temp = new Node();
    		temp.key = key;
    		temp.val = value;
    		this.addDll(temp);
    		this.map.put(key, temp);
    		if(this.map.size()>this.capacity) {
    			this.map.remove(removeLast(tail).key);
    		}
    	}else {
    		node.val=value;
    		this.removeDll(node);
    		this.addDll(node);
    	}
    }
    public void addDll(Node node) {
    	node.next = head.next;
    	head.next.prev = node;
    	head.next = node;
    	node.prev = head;
    	
    }
    public void removeDll(Node node) {
    	Node prevpt = node.prev;
    	Node nextpt = node.next;
    	prevpt.next= nextpt;
    	nextpt.prev = prevpt;
    }
    public Node removeLast(Node tail) {
    	Node prevTail = tail.prev;
    	this.removeDll(prevTail);
    	return prevTail;
    }
}
