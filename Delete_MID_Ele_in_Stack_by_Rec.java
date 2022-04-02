class St1{
     int top=-1;
     int arr[];
     public St1(){
         arr= new int[10];
     }
    public  void push (int a){
        if(top==(arr.length-1)){
            System.out.println("full");
            return;
        }
        top++;
        arr[top]=a;
    }
    public void pop(){
         if(top==-1){
             System.out.println("empty");
             return;
         }
         top--;
    }
}
public class Delete_MID_Ele_in_Stack_by_Rec {
    public static void main(String[] args) {
        St1 obj= new St1();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        int k=(obj.top/2)+1;
        sort(obj,k);


        for(int i=0;i<=obj.top;i++){
            System.out.println(obj.arr[i]);
        }

    }

    public static void sort(St1 obj,int k){
        if(k==1){
            obj.pop();
            return;
        }
        int temp=obj.arr[obj.top];
        obj.pop();
        sort(obj,k-1);

        obj.push(temp);

    }

}

