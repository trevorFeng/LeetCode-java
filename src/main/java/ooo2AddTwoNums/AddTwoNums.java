package ooo2AddTwoNums;

public class AddTwoNums {

    public static void main(String[] args) {

    }

    private static ListNode addTwoNums(ListNode node1, ListNode node2) {
       ListNode target = new ListNode(0);
       ListNode p = target;
       int carry = 0;
       while (node1 != null || node2 != null || carry > 0) {
           ListNode temp1 = node1 == null ? new ListNode(0) : node1;
           ListNode temp2 = node2 == null ? new ListNode(0) : node2;
           node1 = node1 == null ? null : node1.next;
           node2 = node2 == null ? null : node2.next;
           int sum = temp1.val + temp2.val + carry;
           carry = sum / 10;
           p.next = new ListNode(sum % 10);
           p = p.next;
       }
       return target.next;
    }
}


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
