/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author asus
 */
public class Tree {

    public class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        boolean hasNoChild() {
            return left == null && right == null;
        }
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

        if (node.hasNoChild()) {
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

        return Math.max(left, right);

    }
}
