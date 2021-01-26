package ooo4ReverseLink;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        ListNode t1 = new ListNode(5);
        ListNode t2 = new ListNode(10);
        ListNode t3 = new ListNode(20);
        ListNode t4 = new ListNode(30);
        t3.next = t4;
        t2.next = t3;
        t1.next = t2;
        ListNode result = reverse(t1);
        System.out.println(result);

    }

    private static ListNode reverse(ListNode node) {
        ListNode targetNode = null;
        while (node != null) {
            //将节点摘除
            ListNode p = node;
            node = node.next;
            //头插法插入链表
            p.next = targetNode;
            targetNode = p;
        }
        return targetNode;
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