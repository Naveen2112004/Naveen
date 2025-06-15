class Node {
    int data;
    Node next;    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class InsertAtPosition {
    private Node head;    
    public void insertAtPosition(int newData, int position) {
        Node newNode = new Node(newData);
        if (position == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }        
        Node prev = null;
        Node current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position) {
            currentPosition++;
            prev = current;
            current = current.next;
        }
        if (currentPosition != position) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        newNode.next = current;
        prev.next = newNode;
    }
}