/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 18-02-2021
 *   Time: 5:29 AM
 *   File: Node.java
 */

package implementation;

public class Node {
    private int data;
    private Node next;
    private Node previous;
    public Node(int data) {
        this.data = data;
        next = null;
        previous = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
