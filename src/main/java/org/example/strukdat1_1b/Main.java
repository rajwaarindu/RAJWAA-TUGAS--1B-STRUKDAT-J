package org.example.strukdat1_1b;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    static Node first;

    public static void main(String[] args) {
        first = new Node(2);
        Node second = new Node(23);
        Node third = new Node(56);
        Node fourth = new Node(7);
        Node fifth = new Node(12);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Sebelum update:");
        display();

        update(56, 80);

        System.out.println("Setelah update(56,80):");
        display();
    }

    public static void update(int dataLama, int dataBaru) {
        Node current = first;
        while (current != null) {
            if (current.data == dataLama) {
                current.data = dataBaru;
                return;
            }
            current = current.next;
        }
    }

    public static void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
