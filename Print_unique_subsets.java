public class Print_unique_subsets {
    static String  ip="aab";
    static String op=" ";
    static String arr[]=  new String[8];
    static int j=0;
    public static void main(String[] args) {

        solved(ip,op);
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }

    }
    public static void solved(String ip,String op){
        if(ip.length()==0){
            int i;

            for( i=0;i<arr.length;i++){
                   if(op.equals(arr[i])){
                       break;
                   }
               }
               if(i==arr.length){
                   arr[j]=op;
                   j++;
               }
            return;
        }
        String op1=op;
        String op2=op;
        op2+=ip.charAt(0);

        ip=ip.substring(1);

        solved(ip,op1);
        solved(ip,op2);

        return;

    }
}
