import java.util.ArrayList;
import java.util.Collections;

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ArrayList<Integer> reversedL1 = reverseOrder(l1);
		ArrayList<Integer> reversedL2 = reverseOrder(l2);

		int n1 = toNum(reversedL1);
		int n2 = toNum(reversedL2);

		int result = n1 + n2;

		String resultInString = String.valueOf(result); //807

		String reversed = new StringBuilder(resultInString).reverse().toString(); //708

		ListNode finalListNode = createListNode(reversed);

		return finalListNode;
	}

	public ListNode createListNode(String size){
		ListNode finalListNode = new ListNode();
		var pointer = finalListNode;

		for (int i = 0; i < size.length(); i++) {
			char number = size.charAt(i);
			pointer.val = Character.getNumericValue(number);

			if (i < size.length() - 1) { // Só cria novo nó se ainda tem mais
				pointer.next = new ListNode();
				pointer = pointer.next;
			}
		}
		return finalListNode;
	}

	public ArrayList<Integer> reverseOrder(ListNode listNode) {

		ArrayList<Integer> auxList = new ArrayList<Integer>();

		var current = listNode;

		while(current != null){
			auxList.add(current.val);
			current = current.next;
		}

		Collections.reverse(auxList);

		return auxList;
	}

	public int toNum(ArrayList<Integer> list){
		int result = 0;
		for(int digit : list){
			result = result * 10 + digit;
		}
		return result;
	}

	/**Definition for singly-linked list.**/
	public class ListNode {
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
}  