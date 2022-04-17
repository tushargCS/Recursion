import java.util.Scanner;

public class N_bit_binary_no_with_condition {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("enter the no");
    int n=sc.nextInt();
    int one=0;
    int zero=0;
    String op=" ";
    solved(n,one,zero,op);
    }
    public static void solved(int n,int one,int zero,String op){

        if(n==0){
            System.out.println(op);
            return;
        }
        if(one==zero){
                         op+="1";
                         solved(n-1,one+1,zero,op);
                   return;
        }
        char a=op.charAt(one+zero);

        if(zero<one){
            String op1=op;
            op1+="1";
            String op2=op;
            op2+="0";
            solved(n-1,one+1,zero,op1);
            solved(n-1,one,zero+1,op2);
            return;
        }



    }

}
