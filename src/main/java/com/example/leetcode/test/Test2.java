package com.example.leetcode.test;

/**
 * 单向链表模拟两个整数求和
 * @author guwenchang
 * @date 2019-08-15 14:24
 */
public class Test2 {

    static class Node {
        private int value;
        private Node next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        //1-2-3-4
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        //5-6
        Node node2 = new Node(5);
        //链表反转
        Node p1 = reverse(node1);
        Node p2 = reverse(node2);
        int add = 0;
        Node sum = new Node(0);
        //同位相加
        while (p1 != null && p2 != null){
            sum = new Node(0);
            int sumValue = p1.value + p2.value +add;
            add = 0;
            if (sumValue >= 10){
                add = 1;
                sumValue = sumValue - 10;
            }
            sum.setValue(sumValue);
            System.out.println(sum.value);
            p1 = p1.next;
            p2 = p2.next;
            sum = sum.next;
        }
        if (p1 != null){
            sum = p1;
        }
        if (p2 != null){
            sum = p2;
        }

        print(sum);

    }

    public static void print(Node node) {
        while (node != null){
            System.out.println(node.value);
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
