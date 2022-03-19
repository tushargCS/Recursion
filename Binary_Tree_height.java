import java.util.Scanner;

public class Binary_Tree_height {
    public static void main(String[] args) {
            Tree obj1= new Tree();
            Root root=obj1.Create();
            Binary_Tree_height obj= new Binary_Tree_height();
            int c= obj.height(root);
        System.out.println("the height of binary Tree is "+c);
    }
    int Left,Right;
    public int height(Root root){
        if(root==null){return 0;}
        Left=height(root.left);
        Right=height(root.right);

        return 1+max(Left,Right);
    }
    public static int max(int l,int r){
        if(l>r) return l;
        if(l<r) return r;
        if(l==r){return l;}
        return 0;
    }

}

class Root{
    int info;
    Root left;
    Root right;
    public Root(int info){
        this.info=info;
        this.left=null;
        this.right=null;
    }
}
class Tree {

    public Root Create() {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if (data == -1) return null;

        Root root = null;
        root = new Root(data);
        System.out.println("enter the data of left for Root " + root.info);
        root.left = Create();
        System.out.println("enter the data of right for Root " + root.info);
        root.right = Create();

        return root;

    }
}
