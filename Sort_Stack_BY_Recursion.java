class St {
    int top=-1;
    int A[];
    public St(){ A= new int[10]; }

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



public class Sort_Stack_BY_Recursion {

    public static void main(String[] args) {
      St arr= new St();
        arr.push(10);
        arr.push(15);
        arr.push(45);
        arr.push(3);

      sort(arr);

        for(int i=0;i<=arr.top;i++){
            System.out.println(arr.A[i]);
        }

    }

    public static void sort(St arr){
        if(arr.top==0)
        {
            return;
        }
        int temp= arr.A[arr.top];
        arr.pop();
        sort(arr);


        Insert(arr,temp);

    }

    public static void Insert(St arr,int temp){
        if (arr.top == -1 || arr.A[arr.top]<=temp) {
            arr.push(temp);
            return;
        }
        int value=arr.A[arr.top];
        arr.pop();
        Insert(arr,temp);

        arr.push(value);

        return;
    }
}
