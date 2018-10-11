public class Main {

    public static void main(String[] args) {
        Node node1 = new Node('a');
        Node node2 = new Node('b');
        Node node3 = new Node('c');
        Node node4 = new Node('d');
        Node node5 = new Node('e');

        Queue queue = new Queue();
        queue.push(node1);
        queue.push(node2);
        queue.push(node3);
        queue.printQueue();
        queue.pop();
        queue.printQueue();
        queue.push(node4);
        queue.push(node5);
        queue.printQueue();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.printQueue();
        queue.pop();
        queue.printQueue();
        queue.pop();
        queue.printQueue();



    }
}
