public class Queue {
    private LinkedList llist;

    public Queue() {
        this.llist = new LinkedList();
    }

    public void enqueue(int data) {
        this.llist.append(data);
    }

    public int dequeue() {
        return this.llist.deleteAt(0);
    }

    public int front() {
        return this.llist.searchByIndex(0);
    }

    public int rear() {
        return this.llist.searchByIndex(this.llist.size() - 1);
    }

    public boolean isEmpty() {
        return this.llist.isEmpty();
    }

    public void print() {
        this.llist.print();
    }
}
