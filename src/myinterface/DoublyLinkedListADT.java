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

    /**
     * This method will remove the first node of the linked list.
     * It is also known as deleteFromHead or deleteFromBeginning.
     *
     * @return data of the first node, if list not empty, otherwise it will return 0,
     * considering 0 as invalid data.
     */
    int removeFirst();

    /**
     * This method will remove the last node of the linked list.
     * It is also known as deleteFromTail or deleteFromEnd.
     * This method will use tail reference to delete the last node.
     *
     * @return data of the last node, if list not empty, otherwise it will return 0,
     * considering 0 as invalid data.
     */
    int removeLast();

    /**
     * This method will remove the last node of the linked list.
     * It is also known as deleteFromTail or deleteFromEnd.
     * This method will not use tail reference to delete the last node.
     * In this you have to traverse and identify the last node to delete
     *
     * @return data of the last node, if list not empty, otherwise it will return 0,
     * considering 0 as invalid data.
     */
    int removeLastWithoutUsingTail();

    /**
     * This method will remove the given node, which contains the givenElement.
     * If givenElement present in the list, it will delete the node containing givenElement
     * otherwise it will return 0.
     *
     * @param givenElement the element of the given linked list
     * @return will return the data of deleted node, if node present in list otherwise it will
     * return 0, considering 0 as invalid data.
     */
    int removeGivenNode(int givenElement);

    /**
     * This method will return the data of the first node, if linked list is not empty.
     * This is also known as headElement or firstElement
     *
     * @return will return data of the first node if linked list is not empty,
     * otherwise it will return 0, considering 0 as invalid data.
     */
    int first();
    /**
     * This method will return the data of the last node, if linked list is not empty.
     * This is also known as tailElement or lastElement.
     * This method will use tail reference.
     *
     * @return will return data of the last node if linked list is not empty,
     * otherwise it will return 0, considering 0 as invalid data.
     */
    int last();
    /**
     * This method will return the data of the last node, if linked list is not empty.
     * This is also known as tailElement or lastElement.
     * This method will not use tail reference.
     * In this you have to traverse and identify the last node
     *
     * @return will return data of the last node if linked list is not empty,
     * otherwise it will return 0, considering 0 as invalid data.
     */
    int lastWithoutUsingTail();

    /**
     * This method will check if linked list is empty or not.
     *
     * @return will return true is linked list is empty, otherwise false.
     */
    boolean isEmpty();

    /**
     * This method will return total number of nodes in given linked list.
     *
     * @return will return an integer value that is total number of nodes in linked list.
     */
    int size();
}
