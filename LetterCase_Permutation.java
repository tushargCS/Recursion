import java.util.Locale;

public class LetterCase_Permutation {
    public static void main(String[] args) {
        String ip="a1B2";
        String op=" ";
        String[]arr= new String[10];
        int i=solved(ip,op,arr);
        for (int j=0;j<i;j++){
            System.out.println(arr[j]);
        }
    }
    static int i=0;
    public static int solved(String ip,String op,String arr[]){
                    if(ip.length()==0) {
                        arr[i] = op;
                        i++;
                        return i;
                    }

                    int a=ip.charAt(0);


                   if(a>=48&&a<=57){
                       op+=ip.charAt(0);
                       ip=ip.substring(1);
                       solved(ip,op,arr);
                        return i;
                   }

                       String op1 = op;
                       String c=" ";
                               c= String.valueOf(ip.charAt(0));
                               c=c.toLowerCase();
                       op1 += c;

                       String op2 = op;
                       String d=" ";
                       d= String.valueOf(ip.charAt(0));
                       d=d.toUpperCase();
                       op2+=d;

                       ip = ip.substring(1);

                       solved(ip, op1, arr);
                       solved(ip, op2, arr);

                       return i;


    }
}
