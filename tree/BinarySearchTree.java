package tree;

import tree.binaryTree.*;

public class BinarySearchTree {

    Node root = null;

    public BinarySearchTree() {
        root = null;
    }

    public void Insert(int key) {
        root = Insert(key, root);

    }

    private Node Insert(int key, Node root) {

        if (root == null) {
            root = new Node(key);

            return root;
        }
        if (key < root.key) {
            root.left = Insert(key, root.left);
        } else {
            root.right = Insert(key, root.right);
        }

        return root;
    }

    public void Inorder() {
        Inorder(root);
    }

    private void Inorder(Node rNode) {
        if (rNode == null)
            return;

        Inorder(rNode.left);
        System.out.print(rNode.key + " ");
        Inorder(rNode.right);
    }

    public void Search(int key) {
        boolean find = Search(key, root);
        if (find == false) {
            System.out.println("Not found " + key);
        } else
            System.out.println("found " + key);
    }

    private Boolean Search(int key, Node rNode) {
        boolean find = false;
        if(rNode== null) return find;
        if (key == rNode.key) {
            find = true;
            return find;
        } else {
            if (key > rNode.key) {
               
                return Search(key, rNode.right);
            } else if (key < rNode.key) {
                
                return Search(key, rNode.left);
            }
        }

        return find;
    }

    public void Max(){
        int Maxi = Max(root);
        System.out.println("Maximum value: "+Maxi); 
    }

    private int Max(Node rNode){
        int Max = -1;
        while(rNode!=null){
            if(rNode.right == null){
                Max = rNode.key;
            }
            rNode = rNode.right;

        }
        return Max;
    }

    public void Min(){
        int Mini = Min(root);
        System.out.println("Minimum Value: "+Mini); 
    }

    private int Min(Node rNode){
        int Min = -1;
        while(rNode!=null){
            if(rNode.left == null){
                Min = rNode.key;
            }
            rNode = rNode.left;

        }
        return Min;
    }

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();

        b.Insert(40);
        b.Insert(80);
        b.Insert(15);
        b.Insert(1);
        b.Insert(5);
        b.Insert(90);
        b.Insert(75);
        b.Insert(89);
        b.Insert(20);

        b.Inorder();
        System.out.println();
        b.Search(50);
        b.Max();
        b.Min();
    }
}
