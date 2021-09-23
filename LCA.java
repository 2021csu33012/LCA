import java.util.Scanner;

class Node{
    int data;
    Node left, right;

    public Node(int number){
        data = number;
        left = right = null;
    }
}

public class LCA{
    Node root;
    static boolean visited1 = false, visited2 = false;

    Node findLCA(Node node, int value1, int value2){
        if (node == null){
            return null;
        }

        Node tempNode = null;

        if (node.data == value1){
            visited1 = true;
            tempNode = node;
        }

        if (node.data == value2){
            visited2 = true;
            tempNode = node;
        }

        Node leftLCA = findLCA(node.left, value1, value2);
        Node rightLCA = findLCA(node.right, value1, value2);

        if (tempNode != null){
            return tempNode;
        }

        if (leftLCA != null && rightLCA != null){
            return node;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    Node getLCA(int aNode1, int aNode2){
        visited1 = false;
        visited2 = false;

        Node lca = findLCA(root, aNode1, aNode2);
        if (visited1 && visited2){
            return lca;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int node1 = 0;
        int node2 = 0;
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(13);
        tree.root.left.right.left = new Node(14);
        tree.root.left.right.right = new Node(15);
        tree.root.left.left.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(9);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(10);
        tree.root.right.right.left = new Node(11);
        tree.root.right.right.left = new Node(12);

        System.out.print("Enter 1st node: ");
        if (scan.hasNextInt()){
            node1 = scan.nextInt();
        }
        else{
            System.out.print("Invalid input.. Ending!");
            System.exit(0);
        }

        System.out.print("Enter 2nd node: ");
        if (scan.hasNextInt()){
            node2 = scan.nextInt();
        }
        else{
            System.out.print("Invalid input.. Ending!");
            System.exit(0);
        }

        Node lowest = tree.getLCA(node1, node2);
        System.out.print("Lowest common ancestor is: " + lowest.data + ".");
    }
}