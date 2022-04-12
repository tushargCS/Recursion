import java.util.Locale;

public class Permutation_with_spaces {
    public static void main(String[] args) {
        String ip="abc";
        String op=" ";
        String op1 =op;
        op1 +=ip.charAt(0);
        ip=ip.substring(1);
        Solved(ip,op1);
    }
    public static void Solved(String ip,String op1){
               if(ip.length()==0){
                   System.out.println(op1);
                   return;
               }

               String op2=op1;
               op1 +=' ';
               op1+=ip.charAt(0);
               op2+=ip.charAt(0);
               ip=ip.substring(1);

               Solved(ip,op1);
               Solved(ip,op2);

               return;
    }
}
