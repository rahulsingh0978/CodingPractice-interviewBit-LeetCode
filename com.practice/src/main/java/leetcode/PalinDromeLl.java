package leetcode;

public class PalinDromeLl {
	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		ListNode s = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			s = s.next;
			fast = fast.next.next;
		}
		fast = s.next;
		s.next = null;
		ListNode t = null;
		ListNode p = fast;
		ListNode n = fast.next;

		while (n != null) {
			p.next = t;
			t = p;
			p = n;
			n = n.next;
		}
		p.next = t;

		
		return true;

	}

	/*
	 * if(head == null || head.next == null) return true; ListNode fast = head.next;
	 * ListNode slow = head;
	 * 
	 * // find out mid element of list while (fast != null && fast.next != null) {
	 * fast = fast.next.next; slow = slow.next; } fast = slow.next; slow.next =
	 * null;
	 * 
	 * // Now reverse the fast list ListNode reverse = null; ListNode prev = null;
	 * while (fast != null) { prev = fast; fast = fast.next; prev.next = reverse;
	 * reverse = prev; }
	 * 
	 * //Now compare reverse list and head list while(head != null && reverse !=
	 * null) { if(head.val != reverse.val){ return false; } head = head.next;
	 * reverse = reverse.next; } return true;
	 */

	public static void main(String[] args) {

	}
}
