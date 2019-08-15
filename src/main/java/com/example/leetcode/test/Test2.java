package com.example.leetcode.test;

/**
 * 单向链表模拟两个整数求和
 * @author guwenchang
 * @date 2019-08-15 14:24
 */
public class Test2 {

    static class Node {
         int val;
         Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        //1-2-3-4
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        //5-6
        Node node2 = new Node(1);
        node2.next = new Node(2);
        node2.next.next = new Node(3);
        node2.next.next.next = new Node(4);
        //链表反转
        Node l1 = reverse(node1);
        Node l2 = reverse(node2);
        Node root = new Node(0);
        Node cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            Node sumNode = new Node(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        print(root.next);

    }

    public static void print(Node node) {
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }




    public static Node reverse(Node node) {
        Node prev = null;
        Node now = node;
        while (now != null) {
            Node next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }
        return prev;
    }


}
