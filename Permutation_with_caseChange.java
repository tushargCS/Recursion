public class Permutation_with_caseChange {
    public static void main(String[] args) {
        String ip="ab";
        String op=" ";
        solved(ip,op);
    }
    public static void solved(String ip,String op){

        if(ip.length()==0){
            System.out.println(op);
            return;
        }

        String op1=op;
        String op2=op;

        op1+=ip.charAt(0);

        String s="";
        s+=ip.charAt(0);
        s=s.toUpperCase();
        op2+=s;
        ip= ip.substring(1);
        solved(ip,op1);
        solved(ip,op2);
        }
}
