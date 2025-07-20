/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

	/**
	 * Time Complexity: O(n)
	 * We traverse each node from both input lists exactly once.
	 * The loop continues until we reach the end of both lists.

	 * Space Complexity: O(1)
	 * We only use a fixed number of pointers (no extra data structures),
	 * so the space used does not depend on the input size.
	 */

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// Validations
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		ListNode result = new ListNode(-1);
		ListNode pointer = result;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				pointer.next = list1;
				list1 = list1.next;
			} else {
				pointer.next = list2;
				list2 = list2.next;
			}
			pointer = pointer.next;
		}

		// Attach the remaining nodes after one list ends
		if (list1 != null) {
			pointer.next = list1;
		} else {
			pointer.next = list2;
		}

		return result.next;
	}

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}