import java.util.Scanner;

public class Josephus_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        System.out.println("enter the k");
        int k=sc.nextInt();
        int arr[]= new int[n];
        int j=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=j;
            j++;
        }

        k--;
        int index=0;
        solve(arr,k,index);
    }
    public static void solve(int arr[],int k,int index){
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }

        index=(index+k)%arr.length;
        for(int j=index;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        int b[]=change(arr);
        arr=b;

        solve(arr,k,index);

        return;
    }
    public static int[] change(int[] arr){
        int arr1[]= new int[arr.length-1];
       for(int i=0;i< arr1.length;i++){
           arr1[i]=arr[i];
       }

         return arr1;
    }
}
