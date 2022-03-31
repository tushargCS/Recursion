public class Print_Subsets {
    public static void main(String[] args) {
        String ip = new String("abc");
        String op= new String(" ");
            Solved(ip,op);
    }
    public static void Solved(String ip,String op){
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        String op1=op;
        String op2=op;

        op2 += ip.charAt(0);
        ip = ip.substring(1);
        Solved(ip,op1);
        Solved(ip,op2);

        return;
    }

}
