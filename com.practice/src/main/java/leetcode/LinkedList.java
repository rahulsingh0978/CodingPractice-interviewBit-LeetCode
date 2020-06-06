package leetcode;


public class LinkedList {
	int val;
	LinkedList next;

	LinkedList() {
	}

	LinkedList(int val) {
		this.val = val;
	}

	LinkedList(int val, LinkedList next) {
		this.val = val;
		this.next = next;
	}

	
	public static void main(String[] args) {
		
		
		LinkedList obj4 = new LinkedList(6,null);
		
		LinkedList obj3 = new LinkedList(5,obj4);
		LinkedList obj2 = new LinkedList(4,obj3);
		LinkedList head = new LinkedList(3,obj2);
		
		
		
		LinkedList t=null;
		LinkedList p = head;
		LinkedList n = head.next;
		
		while(n!=null) {
			p.next=t;
			t=p;
			p=n;
			n=n.next;
		}p.next=t;
		
		while(p !=null) {
			System.out.print(p.val+"->");
			p = p.next;
		}
		System.out.print("null");
		
				
	}
}
