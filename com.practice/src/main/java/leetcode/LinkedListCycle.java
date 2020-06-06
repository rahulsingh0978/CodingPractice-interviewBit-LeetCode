package leetcode;

public class LinkedListCycle {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second !=null && second.next!=null){
            first=first.next;
            second=second.next.next;
            if(first==second){
                first=head;
                while(first!=second){
                    first=first.next;
                    second=second.next;
                }
                return first;
            }
        } 
        return null;
    }
	public boolean hasCycle(ListNode head) {
		if(head==null) {
			return false;
		}
			
		
		ListNode prev = head;
		ListNode next = prev.next;
		while (next!=null) {
			if (prev == next) {
				return true;
			}
			prev = prev.next;
			next = next.next.next;
		}
		return false;
	}
}
