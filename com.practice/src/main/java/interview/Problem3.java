package interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem3 {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList();
		Scanner sc = new Scanner(System.in);
		//int[] cache = new int[4];
		for(int i=0;i<4;i++) {
			queue.offer(sc.nextInt());
		}
		sc.nextLine();
		
		for(int i: queue) {
			System.out.println("items :"+i);
		}
		System.out.println("Want to add more items press 1 for yes 2 for no?");
		int temp = sc.nextInt();
		if(temp==1) {
			int value = sc.nextInt();
			if(queue.size()==4) {
				queue.poll();
			}
			queue.offer(value);
		}
		
		for(int i: queue) {
			System.out.println("items :"+i);
		}
		
		System.out.println("Want to remove items press 1 for yes 2 for no?");
		int temp2 = sc.nextInt();
		if(temp2==1) {
			if(queue.isEmpty()) {
				System.out.println("Queue is empty ");
			}
			else {
				queue.poll();
			}
		}
		
		for(int i: queue) {
			System.out.println("items :"+i);
		}
		
	}
}
