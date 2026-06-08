public class AddTwoNumbers {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int firstValue = l1 != null ? l1.val : 0;
			int secondValue = l2 != null ? l2.val : 0;
			int sum = firstValue + secondValue + carry;

			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;

			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}

		return dummyHead.next;
	}

	private static ListNode buildList(int... values) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;

		for (int value : values) {
			current.next = new ListNode(value);
			current = current.next;
		}

		return dummyHead.next;
	}

	private static void printList(ListNode head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.val);
			if (current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		AddTwoNumbers solver = new AddTwoNumbers();
		ListNode l1 = buildList(2, 4, 3);
		ListNode l2 = buildList(5, 6, 4);

		ListNode result = solver.addTwoNumbers(l1, l2);
		printList(result);
	}
}
