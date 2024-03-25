public class Stack {
    private LinkedList llist;

    public Stack() {
        this.llist = new LinkedList();
    }

    public void push(int data) {
        this.llist.append(data);
    }

    public int pop() {
        return this.llist.deleteAt(this.llist.size() - 1);
    }

    public boolean isEmpty() {
        return this.llist.isEmpty();
    }

    public void print() {
        this.llist.print();
    }
}
