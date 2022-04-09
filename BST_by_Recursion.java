import java.util.Scanner;

class Node3{
    int data;
    Node3 left;
    Node3 right;
    Node3(int data){
        this.data=data;
    }
}
public class BST_by_Recursion {
    static Node3 root;
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a=-1;
    while(a==-1){
        System.out.println("enter data");
        int data=sc.nextInt();
         root= create(root,data);
        System.out.println("press -1 to continue");
          a=sc.nextInt();
    }
    print(root);
    }
    public static void print(Node3 root){
        if(root==null){return;}
        System.out.println(root.data);
        print(root.left);
        print(root.right);

    }
    public static Node3 create(Node3 root,int data){
        if(root==null){

            Node3 newNode = new Node3(data);
           root=newNode;
           return root;
        }
        else {
            Node3 par=root;
            if(par.data>data){if(par.left==null){par.left=create(par.left,data);return root;}create(par.left,data);}
            else if(par.data<data){if(par.right==null){par.right=create(par.right,data);return root;}create(par.right,data);}

        }
        return root;
    }
}
