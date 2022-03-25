public class Generate_all_balance_parentheses {
    public static void main(String[] args) {
        int n=5;
        String arr[]= new String[100];
        fun(n,arr);

        for(int j=0;j<i;j++){
            System.out.println(arr[j]);
        }
    }
    public static void fun(int n,String arr[]){
        int open=n;
        int close=n;
        String op=" ";
       solved(open,close,op,arr);

    }
    static int i=0;
    public static void solved(int open,int close,String op,String arr[]){
        if(open==0&&close==0){
            arr[i]=op;
            i++;
            return;
        }
        if(open!=0){
            String op1=op;
            op1+="(";
            solved(open-1,close,op1,arr);
        }
        if(close>open){
            String op2=op;
            op2+=")";
            solved(open,close-1,op2,arr);
        }
        return;
    }
}
