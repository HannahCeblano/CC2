import java.util.Scanner; // Add this import statement

class AVLNode {
    int key;
    int height;
    AVLNode left, right;

    public AVLNode(int key) {
        this.key = key;
        this.height = 1;
    }
}

class AVLTree {
    private AVLNode root;

    private int height(AVLNode node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(AVLNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private AVLNode insertNode(AVLNode node, int key) {
        if (node == null) return new AVLNode(key);

        if (key < node.key) {
            node.left = insertNode(node.left, key);
        } else if (key > node.key) {
            node.right = insertNode(node.right, key);
        } else {
            return node; // No duplicate keys
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key) return rightRotate(node);
        if (balance < -1 && key > node.right.key) return leftRotate(node);
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void printPreorder() {
        preorderTraversal(root);
        System.out.println();
    }

    private void preorderTraversal(AVLNode node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
}

public class AVLTreeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AVLTree avlTree = new AVLTree();

        // Ask the user how many values they will insert
        System.out.print("Enter 'insert' or 'end': ");
        String command = scanner.next();

        if (command.equalsIgnoreCase("insert")) {
            System.out.print("How many values would you like to insert: ");
            int numberOfValues = scanner.nextInt();
            
            for (int i = 0; i < numberOfValues; i++) {
                System.out.print("Enter integer value or 'end' to stop: ");
                if (scanner.hasNextInt()) {
                    int value = scanner.nextInt();
                    avlTree.insert(value);
                } else {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("end")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                    }
                }
            }
        }

        // Print the tree's preorder traversal
        System.out.println("Preorder Traversal of the AVL Tree:");
        avlTree.printPreorder();
        scanner.close();
    }
}
