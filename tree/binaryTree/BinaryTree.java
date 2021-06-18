package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    
    static Scanner sc = null;
    public static Node CreateTree(){
        Node root = null;
        int data = sc.nextInt();
        if(data==-1) return null;
        root = new Node(data);
        System.out.println("for left " +data);
        root.left = CreateTree();
        System.out.println("for right "+data);
        root.right=CreateTree();

        return root;

    }
    
public static void inOreder(Node root){
    if(root==null) return;
    inOreder(root.left);
    System.out.print(root.key +" ");
    inOreder(root.right);
}

public void preOreder(Node root){
    if(root==null) return;
    System.out.print(root.key +" ");
    preOreder(root.left);
    preOreder(root.right);
}
public static void postOreder(Node root){
    if(root==null) return;
    postOreder(root.left);
    postOreder(root.right);
    System.out.print(root.key +" ");
}

public static void que(Node root){
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    Node temp=null;
    
    while (!q.isEmpty()) {
        
        temp=q.peek();
        // if(temp.left==null && temp.right==null)return;
        System.out.print("x " +temp.key +" ");
        q.remove();
        if(temp.left!=null)q.add(temp.left);
        if(temp.right!=null)q.add(temp.right);
        
    }
}

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter data");
        Node root = CreateTree();
        inOreder(root);
        System.out.println();
        que(root);
        sc.close();

    }
}
