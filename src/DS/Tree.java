package DS;

class BST {
    BST root = null;
    int data;
    BST left = null;
    BST right = null;

    public BST traverse(BST temp, int data) {
        BST prev = temp;
        while (temp != null) {
            prev = temp;
            if (data > temp.data)
                temp = temp.right;
            else
                temp = temp.left;
        }
        return prev;
    }

    public void add(int data) {
        if (this.root == null) {

            BST n = new BST();
            n.data = data;
            System.out.println(data + " root node added");
            this.root = n;

        } else {
            BST temp = traverse(this.root, data);
            BST node = new BST();
            node.data = data;


            if (data <= temp.data)
                temp.left = node;
            else
                temp.right = node;

        }

    }

    public void inprint(BST node) {//inorder printing of bst
        if (node.left != null)
            inprint(node.left);
        System.out.println(node.data);
        if (node.right != null)
            inprint(node.right);
    }

}

public class Tree {

    public static void main(String[] args) {
        BST tree = new BST();
        tree.add(4);
        tree.add(2);
        tree.add(6);
        tree.add(1);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.inprint(tree.root);


    }

}
