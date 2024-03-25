public class LinkedList {

    private SingleNode head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        SingleNode node = new SingleNode(data);

        if (this.head == null) {
            this.head = node;
        } else {
            SingleNode current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insert(int index, int data) {
        if (index > this.size()) {
            System.out.println("[LOG] Invalid index");
        } else {
            SingleNode node = new SingleNode(data);
            SingleNode current = this.head;
            if (index == 0) {
                node.next = this.head;
                this.head = node;
            } else {
                int i = 0;
                while (i < index - 1) {
                    current = current.next;
                    i += 1;
                }
                node.next = current.next;
                current.next = node;
            }
        }
    }

    public void delete(int data) {
        SingleNode current = this.head;
        if (current.data == data) {
            this.head = current.next;
            return;
        } else {
            while (current != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
            System.out.println("[LOG] Data to delete is not found.");
        }
    }

    public int deleteAt(int index) {
        if (index > this.size()) {
            System.out.println("[LOG] Invalid index");
            return -1;
        } else if (index == 0) {
            SingleNode current = this.head;
            this.head = current.next;
            return current.data;
        } else {
            SingleNode current = this.head;
            int i = 0;
            while (i < index - 1) {
                current = current.next;
                i += 1;
            }
            int data = current.next.data;
            current.next = current.next.next;
            return data;
        }
    }

    public int searchByIndex(int index) {
        if (index > this.size()) {
            System.out.println("[LOG] Invalid index");
            return -1;
        } else {
            SingleNode current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

    public void reverse() {
        SingleNode previous = null;
        SingleNode current = this.head;
        SingleNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }

    public int size() {
        int size = 0;
        SingleNode current = this.head;
        while (current != null) {
            size += 1;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void print() {
        SingleNode current = this.head;
        while (current != null) {
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println();
    }
}
