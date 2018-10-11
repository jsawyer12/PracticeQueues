public class Node {

    private char value;
    private Node next;

    public char getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(char value) {
        this.value = value;
    }
}
