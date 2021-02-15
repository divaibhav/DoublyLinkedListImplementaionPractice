package myinterface;

/**
 * This interface contains,
 * all the method that are part of Doubly Linked List ADT
 */
public interface DoublyLinkedListADT {
    /**
     * This method will add a new node in the linked list at the head.
     * It is also known as insertAtBeginning or insertAtHead.
     * It also increase the size of linked list
     * @param element it is the element of the sequence, we are creating
     *                an integer linked list.
     */
    void addFirst(int element);

    /**
     * This method will add a new node in the linked list at the end or tail.
     * It is also known as insertAtTail or insertAtEnd.
     * It also increase the size of linked list
     * @param element it is the element of the sequence, we are creating
     *                an integer linked list.
     */
    void addLast(int element);

    /**
     * This method will add a new node in the linked list after the node containing givenElement,
     * if the givenElement not present in the list it will not add the node.
     * It also increase the size of linked list if givenElement is present.
     * @param element it is the element of the sequence.
     * @param givenElement it is the element after which we have to add the node
     */
    void addInBetween(int element, int givenElement);
}
