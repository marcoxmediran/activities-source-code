public class SingleNode {
    public int data;
    public SingleNode next;

    public SingleNode(int data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return "" + this.data;
    }
}
