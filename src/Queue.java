import java.util.LinkedList;

public class Queue {

    private Node head;
    private Node tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void push(Node node) {
        if (head != null) {
            tail.setNext(node);
            tail = node;
        }
        else {
            head = node;
            tail = node;
        }
    }

    public Node pop() {
        if (head != null) {
            Node temp = head;
            if (head.getNext() != null)
                head = head.getNext();
            else
                head = null;
            return head;
        }
        return null;
    }

    public void printQueue() {
        System.out.print('[');
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getValue());
            if (temp.getNext() != null)
                System.out.print(", ");
            temp = temp.getNext();
        }
        System.out.println(']');
    }
}
