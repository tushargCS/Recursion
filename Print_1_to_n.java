import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        Print obj= new Print();
        obj.print(s);
    }
    public int print(int s){
        if(s==1) {
            System.out.println(s);
            return 1;
        }
        System.out.println(s);
        print(s-1);

        return 1;
    }
}
