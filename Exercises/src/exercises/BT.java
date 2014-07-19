/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author asus
 */
public class BT {

    Node root;

    public BT() {
        root = null;
    }

    public String encode(Node node, StringBuilder sb) {

        if (node == null) {
            sb.append('*');
        } else {
            sb.append(node.data);
            encode(node.left, sb);
            encode(node.right, sb);
        }
        return sb.toString();
    }

    public int count1Child(Node node) {

        if (node == null) {
            return 0;
        }
        if (((node.right == null) && (node.left != null))
                || ((node.left == null) && (node.right != null))) {
            return 1 + count1Child(node.left) + count1Child(node.right);
        }
        return count1Child(node.left) + count1Child(node.right);
    }

    public int count2Child(Node node) {

        if (node == null) {
            return 0;
        }
        if ((node.right != null) && (node.left != null)) {
            return 1 + count2Child(node.left) + count2Child(node.right);
        }

        return count2Child(node.left) + count2Child(node.right);
    }

    boolean isBalanced(Node node) {

        if (node == null) {
            return true;
        }

        if (findDepth(node) == -1) {
            return false;
        }

        return true;

    }

    int findDepth(Node node) {

        if (node.isLeaf()) {
            return 1;
        }

        int left = 0;
        int right = 0;

        if (node.left != null) {
            left = findDepth(node.left) + 1;
        }
        if (node.right != null) {
            right = findDepth(node.right) + 1;
        }
       if (Math.abs(left - right) > 1) {
			return -1;
		}
        return Math.max(left, right);
    }

    public static Node buildTree() {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node y = new Node('Y');
        Node x = new Node('X');
        Node k = new Node('K');

        a.left = b;
        a.right = c;
        b.left = d;
        d.left = x;
        x.left = k;


        return a;
    }

    static class Decoder {

        String input;
        int i = 0;

        Decoder(String input) {
            this.input = input;
        }

        Node decode() {
            char c = input.charAt(i++);
            if (c == '*') {
                return null;
            }
            Node n = new Node(c);
            n.left = decode();
            n.right = decode();
            return n;
        }
    }

    /*
     * inner node class
     */
    static class Node {

        char data;
        Node right;
        Node left;

        public Node(char data) {
            this.data = data;
        }

        public boolean isLeaf() {
            return (right == null && left == null);
        }
    }

    public static void main(String[] args) {

        BT bt = new BT();
        Node tree1 = buildTree();

        System.out.println(bt.count1Child(tree1));
        System.out.println(bt.count2Child(tree1));

        System.out.println(bt.findDepth(tree1));


        /*
         StringBuilder sb = new StringBuilder();
         String encoded = bt.encode(tree1, sb);
         System.out.println(encoded);

         Decoder d = new Decoder(encoded);
         Node tree2 = d.decode();

         sb = new StringBuilder();
         String encoded2 = bt.encode(tree2, sb);
         System.out.println(encoded2);

         //String bi sınıf olduğundan == çalışmaz 
         if (encoded.equals(encoded2))
         System.out.println("successss");
         else System.out.println("not working");*/
    }
}
