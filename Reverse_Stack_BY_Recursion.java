public class Reverse_Stack_BY_Recursion {
    public static void main(String[] args) {
    St2 obj= new St2();
       obj.push(23);
       obj.push(14);
       obj.push(10);
       obj.push(11);

       reverse(obj);
       for(int i=obj.top;i>=0;i--){
           System.out.println(obj.A[i]);
       }
    }

    public static void reverse(St2 obj){
        if(obj.top==0){
            return;
        }
        int temp=obj.A[obj.top];
        obj.pop();
        reverse(obj);

        Insert(obj,temp);


    }
    public static void Insert(St2 obj,int temp){
       if(obj.top==-1){
           obj.push(temp);
           return;
       }
        int value=obj.A[obj.top];
        obj.pop();
        Insert(obj,temp);

        obj.push(value);
        return;
    }
}

class St2{
    int top=-1;
    int A[];
    public St2(){
        A= new int[10];
    }
    public void push(int a){
        if(top==(A.length-1)){
            System.out.println("full");
           return;
        }
        top++;
        A[top]=a;
    }

    public void pop(){
    if(top==-1){
        System.out.println("empty");
         return;
    }
    top--;
    }

}


