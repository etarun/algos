package bst;

import java.util.*;

public class LCA {

    private Node root;

    /* Function to find LCA of n1 and n2. The function assumes that both
       n1 and n2 are present in BST */
    private Node lca(Node node, int n1, int n2) {
        if (node == null)
            return null;

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2)
            return lca(node.left, n1, n2);

        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2)
            return lca(node.right, n1, n2);

        return node;
    }

    /*
    Minimum node of BST
     */
    private Node minimumNode(Node node) {
        if (node.left == null) {
            return node;
        }
        return minimumNode(node.left);
    }

    /*
    Kth-minimum node of BST
    Inorder traversal
     */
    private int kThMinimumNode(Node node, int k) {
        int res = 0;
        Stack<Node>
                stack = new Stack<>();
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                Node currentNode = stack.pop();
                k--;
                if (k == 0) {
                    res = currentNode.data;
                } else {
                    node = currentNode.right;
                }
            }
        }
        return res;
    }

    /*
    BFS - Queue
     */
    private void bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    /*
    Pre-Order traversal
     */
    private void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");

        preOrderTraversal(node.left);

        preOrderTraversal(node.right);
    }

    /*
    Post-Order traversal
    */
    private void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left);

        postOrderTraversal(node.right);

        System.out.print(node.data + " ");
    }

    /*
    In-Order traversal
    */
    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);

        System.out.print(node.data + " ");

        inOrderTraversal(node.right);

    }

    /*
    In-Order returns List
    */
    private ArrayList<Integer> inOrderTraversalList(Node node, ArrayList<Integer> list) {

        if (node == null) {
            return list;
        }
        inOrderTraversalList(node.left, list);

        list.add(node.data);

        inOrderTraversalList(node.right, list);

        return list;

    }

    /*
    Find a pair with given sum in a Balanced BST
     */
    private boolean findPair(Node node, int target) {
        ArrayList<Integer> a1 = new ArrayList<>();

        ArrayList<Integer> sortedList = inOrderTraversalList(node, a1);

        int start = 0;
        int end = sortedList.size() - 1;
        while (start < end) {
            if (sortedList.get(start) + sortedList.get(end) == target) {
                System.out.println("\nPair Found: " + sortedList.get(start) +
                        " + " + sortedList.get(end) + " " + "= " + target);
                return true;
            }
            if (sortedList.get(start) + sortedList.get(end) > target) {
                end--;
            }

            if (sortedList.get(start) + sortedList.get(end) < target) {
                start++;
            }

        }
        System.out.println("\nNo such values are found!");
        return false;
    }

    public static void main(String args[]) {
        // Let us construct the BST shown in the above figure
        LCA tree = new LCA();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        int n1 = 10, n2 = 14;
        Node t = tree.lca(tree.root, n1, n2);
        System.out.println("1. LCA of " + n1 + " and " + n2 + " is " + t.data);

        System.out.println("2. Minimum Value is :" + tree.minimumNode(tree.root).data);

        System.out.println("3. Kth-Minimum Value :" + tree.kThMinimumNode(tree.root, 1));

        System.out.print("4. BFS :");
        tree.bfs(tree.root);

        System.out.print("\n5. Pre-Order Traversal :");
        tree.preOrderTraversal(tree.root);
        System.out.print("\n6. Post-Order Traversal :");
        tree.postOrderTraversal(tree.root);
        System.out.print("\n7. In-Order Traversal :");
        tree.inOrderTraversal(tree.root);
        tree.findPair(tree.root, 22);

    }
}
