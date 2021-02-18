package myinterface;

public interface DoublyLinkedLisADT {
    void addFirst(int element);
    void addLast(int element);
    // addAfterGivenNode(int element, int givenElement);
    // addBeforeCurrentNode(int element, int givenElement);
    void traverse();
    boolean isEmpty();
    int size();
    int removeFirst();
    int removeLast();
}