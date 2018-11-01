package numbers;
import stack.ListNode;

public class AddTwoNumbers {
    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        ListNode l1= new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;


        ListNode res = a.addTwoNumbers(l1, l2);
        while(l1.next != null) {
            System.out.print(l1.val);
            l1 = l1.next;
        }
        System.out.print(l1.val);
        System.out.print("\n");
        System.out.println("---");
        while(l2.next != null) {
            System.out.print(l2.val);
            l2 = l2.next;
        }
        System.out.print(l2.val);
        System.out.print("\n");
        System.out.println("---");
        while(res.next != null) {
            System.out.print(res.val);
            res = res.next;
        }
        System.out.print(res.val);
    }
}
