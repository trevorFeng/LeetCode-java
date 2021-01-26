package ooo5LinkOperation;

public class Test {

    public static void main(String[] args) {
        ListNode node = new ListNode(10);
        node = insertWei(node);
        System.out.println("s");
    }

    //头插法
    private static ListNode insertHead(ListNode node) {
       ListNode p = new ListNode(0);
       p.next = node;
       node = p;
       return node;
    }

    //尾插法
    private static ListNode insertWei(ListNode node) {
        ListNode p1 = new ListNode(3);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(1);
        p2.next = p3;
        p1.next = p2;
        //临时变量记录返回node的最深处
        ListNode p = node;
        while (p1 != null) {
            //将首节点摘除
            ListNode temp = p1;
            p1 = p1.next;

            p.next = temp;
            p = p.next;
        }
        return node;
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