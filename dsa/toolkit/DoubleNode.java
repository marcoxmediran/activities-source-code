public class DoubleNode {
    public int data;
    public DoubleNode left;
    public DoubleNode right;

    public DoubleNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return "" + this.data;
    }
}
