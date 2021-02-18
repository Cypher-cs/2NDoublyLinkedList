/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 18-02-2021
 *   Time: 6:10 AM
 *   File: Main.java
 */

package main;

import com.sun.jdi.connect.Connector;
import implementation.MyDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList();
        doublyLinkedList.addFirst(100);
        doublyLinkedList.traverse();
        doublyLinkedList.addLast(200);
        doublyLinkedList.addLast(300);
        doublyLinkedList.traverse();
        doublyLinkedList.addFirst(50);
        doublyLinkedList.traverse();
        doublyLinkedList.removeFirst();
        doublyLinkedList.traverse();
        doublyLinkedList.removeLast();
        doublyLinkedList.traverse();
        System.out.println("Size = " + doublyLinkedList.size());
    }
}
