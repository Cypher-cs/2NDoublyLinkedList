/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 18-02-2021
 *   Time: 5:34 AM
 *   File: MyDoublyLinkedList.java
 */

package implementation;

import myinterface.DoublyLinkedLisADT;

public class MyDoublyLinkedList implements DoublyLinkedLisADT {
    private Node head;
    private Node tail;
    private int size;

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (!isEmpty()) {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
        else {
            head = node;
            tail = node;
        }
        size++;
    }

    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
        size++;
    }

    @Override
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "<->");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    @Override
    public int removeFirst() {
        if (isEmpty()) {
            return -1;
        }
        else {
            Node response = head;
            if (head == tail) {
                head = null;
                tail = null;
            }
            else {
                head = head.getNext();
            }
            size--;
            return response.getData();
        }
    }

    @Override
    public int removeLast() {
        if (isEmpty()) {
            return -1;
        }
        else {
            Node response = tail;
            if (head == null) {
                head = null;
                tail = null;
            }
            else {
                tail = tail.getPrevious();
                tail.setNext(null);
            }
            size--;
            return response.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return head ==null;
    }

    @Override
    public int size() {
        return size;
    }
}
