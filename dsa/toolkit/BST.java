public class BST {

    public DoubleNode root;

    public BST() {
        this.root = null;
    }

    public void insert(int data) {
        this.root = insertNode(this.root, data);
    }

    public DoubleNode insertNode(DoubleNode node, int data) {
        if (node == null) {
            node = new DoubleNode(data);
            return node;
        } else if (data < node.data) {
            node.left = insertNode(node.left, data);
        } else if (data > node.data) {
            node.right = insertNode(node.right, data);
        } else {
            System.out.println("[LOG] Cannot insert duplicate node");
        }
        return node;
    }

    public boolean search(int data) {
        if (this.searchNode(this.root, data) != null) {
            return true;
        } else {
            return false;
        }
    }

    public DoubleNode searchNode(DoubleNode node, int data) {
        if (node == null || node.data == data) {
            return node;
        } else if (data > node.data) {
            return searchNode(node.right, data);
        } else {
            return searchNode(node.left, data);
        }
    }

    public void delete(int data) {
        this.root = this.deleteNode(this.root, data);
    }

    public DoubleNode deleteNode(DoubleNode node, int data) {
        // Base Case
        if (node == null) {
            return node;
        }

        // Recursion
        if (data < node.data) {
            node.left = deleteNode(node.left, data);
            return node;
        } else if (data > node.data) {
            node.right = deleteNode(node.right, data);
            return node;
        }

        // When the root is about to be deleted
        // Single child Case
        if (node.left == null) {
            DoubleNode temp = node.right;
            return temp;
        } else if (node.right == null) {
            DoubleNode temp = node.left;
            return temp;
        } else {    // Double child case
            DoubleNode parent = node;

            DoubleNode successor = node.right;
            // Find successor
            while (successor.left != null) {
                parent = successor;
                successor = successor.left;
            }
            // Deletion
            if (parent != node) {
                parent.left = successor.right;
            } else {
                parent.right = successor.right;
            }

            node.data = successor.data;
            return node;
        }

    }

    public void print(int mode) {
        switch (mode) {
            case 0:
                System.out.print("Preorder: ");
                preorder(this.root);
                break;
            case 1:
                System.out.print("Inorder: ");
                inorder(this.root);
                break;
            case 2:
                System.out.print("Postorder: ");
                postorder(this.root);
                break;
            default:
                System.out.println("[LOG] Wrong BST print mode.");
                break;
        }
        System.out.println();
    }

    public void preorder(DoubleNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(DoubleNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void postorder(DoubleNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public boolean isEmpty() {
        return this.root == null;
    }
}
