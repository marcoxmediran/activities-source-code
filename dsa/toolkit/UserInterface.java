import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        this.clearScreen();
        while (true) {
            this.mainMenu();
            int mainChoice = this.getInt("Choice: ");
            switch (mainChoice) {
                case 1:
                    this.llistToolkit();
                    break;
                case 2:
                    this.stackToolkit();
                    break;
                case 3:
                    this.queueToolkit();
                    break;
                case 4:
                    this.bstToolkit();
                    break;
                case 0:
                    this.clearScreen();
                    return;
                default:
                    break;
            }
            this.clearScreen();
        }
    }

    public void llistToolkit() {
        this.clearScreen();
        Menu.linkedlist();

        LinkedList llist = null;
        while (true) {
            int choice = this.getInt("Choice: ");

            switch (choice) {
                case 1:
                    llist = new LinkedList();
                    System.out.println("[LOG] Empty linked list created");
                    break;
                case 2:
                    if (llist != null) {
                        int data = this.getInt("Int: ");
                        llist.append(data);
                        System.out.println("[LOG] " + data + " added to linked list");
                    } else {
                        System.out.println("[LOG] No linked list created");
                    }
                    break;
                case 3:
                    if (llist != null) {
                        if (llist.isEmpty()) {
                            System.out.println("[LOG] Linked list is empty");
                        } else {
                            int data = this.getInt("Int: ");
                            llist.delete(data);
                            System.out.println("[LOG] " + data + " deleted from linked list");
                        }
                    } else {
                        System.out.println("[LOG] No linked list created");
                    }
                    break;
                case 4:
                    if (llist != null) {
                        if (llist.isEmpty()) {
                            System.out.println("[LOG] Linked list is empty");
                        } else {
                            llist.reverse();
                            System.out.println("[LOG] Linked list reversed");
                        }
                    } else {
                        System.out.println("[LOG] No linked list created");
                    }
                    break;
                case 5:
                    if (llist != null) {
                        if (llist.isEmpty()) {
                            System.out.println("[LOG] Linked list is empty");
                        } else {
                            System.out.print("Linked list: ");
                            llist.print();
                        }
                    } else {
                        System.out.println("[LOG] No linked list created");
                    }
                    break;
                case 9:
                    this.clearScreen();
                    Menu.linkedlist();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public void stackToolkit() {
        this.clearScreen();
        Menu.stack();

        Stack stack = null;
        while (true) {
            int choice = this.getInt("Choice: ");

            switch (choice) {
                case 1:
                    stack = new Stack();
                    System.out.println("[LOG] Empty stack created");
                    break;
                case 2:
                    if (stack != null) {
                        int data = getInt("Int: ");
                        stack.push(data);
                        System.out.println("[LOG] " + data + " was pushed to the stack");
                    } else {
                        System.out.println("[LOG] Stack not created");
                    }
                    break;
                case 3:
                    if (stack != null) {
                        if (stack.isEmpty()) {
                            System.out.println("[LOG] Stack is empty");
                        } else {
                            int pop = stack.pop();
                            System.out.println("[LOG] " + pop + " was popped from the stack");
                        }
                    } else {
                        System.out.println("[LOG] Stack not created");
                    }
                    break;
                case 4:
                    if (stack != null) {
                        if (stack.isEmpty()) {
                            System.out.println("[LOG] Stack is empty");
                        } else {
                            System.out.print("Stack: ");
                            stack.print();
                        }
                    } else {
                        System.out.println("[LOG] Stack not created");
                    }
                    break;
                case 9:
                    this.clearScreen();
                    Menu.stack();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public void queueToolkit() {
        this.clearScreen();
        Menu.queue();

        Queue queue = null;
        while (true) {
            int choice = this.getInt("Choice: ");

            switch (choice) {
                case 1:
                    queue = new Queue();
                    System.out.println("[LOG] Empty queue created");
                    break;
                case 2:
                    if (queue != null) {
                        int data = getInt("Int: ");
                        queue.enqueue(data);
                        System.out.println("[LOG] " + data + " was enqueued");
                    } else {
                        System.out.println("[LOG] Queue not created");
                    }
                    break;
                case 3:
                    if (queue != null) {
                        if (queue.isEmpty()) {
                            System.out.println("Queue is empty");
                        } else {
                            int data = queue.dequeue();
                            System.out.println("[LOG] " + data + " was dequeued");
                        }
                    } else {
                        System.out.println("[LOG] Queue not created");
                    }
                    break;
                case 4:
                    if (queue != null) {
                        if (queue.isEmpty()) {
                            System.out.println("Queue is empty");
                        } else {
                            int front = queue.front();
                            System.out.println("[LOG] Front: " + front);
                        }
                    } else {
                        System.out.println("[LOG] Queue not created");
                    }
                    break;
                case 5:
                    if (queue != null) {
                        if (queue.isEmpty()) {
                            System.out.println("Queue is empty");
                        } else {
                            int rear = queue.rear();
                            System.out.println("[LOG] Rear: " + rear);
                        }
                    } else {
                        System.out.println("[LOG] Queue not created");
                    }
                    break;
                case 6:
                    if (queue != null) {
                        if (queue.isEmpty()) {
                            System.out.println("Queue is empty");
                        } else {
                            System.out.print("Queue: ");
                            queue.print();
                        }
                    } else {
                        System.out.println("[LOG] Queue not created");
                    }
                    break;
                case 9:
                    this.clearScreen();
                    Menu.queue();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public void bstToolkit() {
        this.clearScreen();
        Menu.bst();

        BST bst = null;
        while (true) {
            int choice = this.getInt("Choice: ");

            switch (choice) {
                case 1:
                    bst = new BST();
                    System.out.println("[LOG] Empty BST created");
                    break;
                case 2:
                    if (bst != null) {
                        int data = getInt("Int: ");
                        bst.insert(data);
                        System.out.println("[LOG] " + data + " was inserted");
                    } else {
                        System.out.println("[LOG] BST not created");
                    }
                    break;
                case 3:
                    if (bst != null) {
                        if (bst.isEmpty()) {
                            System.out.println("[LOG] BST is empty");
                        } else {
                            int data = getInt("Delete: ");
                            if (bst.search(data)) {
                                bst.delete(data);
                                System.out.println("[LOG] " + data + " was deleted");
                            } else {
                                System.out.println("[LOG] " + data + " not found");
                            }
                        }
                    } else {
                        System.out.println("[LOG] BST not created");
                    }
                    break;
                case 4:
                    if (bst != null) {
                        if (bst.isEmpty()) {
                            System.out.println("[LOG] BST is empty");
                        } else {
                            int data = getInt("Search: ");
                            if (bst.search(data)) {
                                System.out.println("[LOG] " + data + " found from the BST");
                            } else {
                                System.out.println("[LOG] " + data + " not found from the BST");
                            }
                        }
                    } else {
                        System.out.println("[LOG] BST not created");
                    }
                    break;
                case 5:
                    if (bst != null) {
                        if (bst.isEmpty()) {
                            System.out.println("[LOG] BST is empty");
                        } else {
                            bst.print(0);
                            bst.print(1);
                            bst.print(2);
                        }
                    } else {
                        System.out.println("[LOG] BST not created");
                    }
                    break;
                case 9:
                    this.clearScreen();
                    Menu.bst();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public void mainMenu() {
        System.out.println("DSA Toolkit");
        System.out.println("-------------------------");
        System.out.println("1. Linked List");
        System.out.println("2. Stack");
        System.out.println("3. Queue");
        System.out.println("4. Binary Search Tree");
        System.out.println("-------------------------");
        System.out.println("0. Exit toolkit");
    }

    public int getInt(String message) {
        System.out.print(message);
        return Integer.valueOf(scanner.nextLine());
    }

    public void clearScreen() {
        System.out.println("\033[H\033[2J");
    }

}
