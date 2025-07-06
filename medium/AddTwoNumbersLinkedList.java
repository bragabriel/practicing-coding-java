import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

class AddTwoNumbersLinkedList {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ArrayList<Integer> reversedL1 = reverseOrder(l1);
		ArrayList<Integer> reversedL2 = reverseOrder(l2);

		BigInteger n1 = toNum(reversedL1);
		BigInteger n2 = toNum(reversedL2);

		BigInteger result = n1.add(n2);

		String resultInString = String.valueOf(result); //807

		String reversed = new StringBuilder(resultInString).reverse().toString(); //708

		return createListNode(reversed);
	}

	public ListNode createListNode(String size) {
		ListNode finalListNode = new ListNode();
		var pointer = finalListNode;

		for (int i = 0; i < size.length(); i++) { //O(n)
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

		while (current != null) { //Big O(n)
			auxList.add(current.val);
			current = current.next;
		}

		Collections.reverse(auxList);

		return auxList;
	}

	public BigInteger toNum(ArrayList<Integer> list) {
		BigInteger result = BigInteger.ZERO;
		for (int digit : list) { //O(n)
			result = result.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
		}
		return result;
	}

	/**
	 * Definition for singly-linked list.
	 **/
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