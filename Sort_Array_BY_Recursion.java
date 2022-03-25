import java.util.ArrayList;
import java.util.List;

public class Sort_Array_BY_Recursion{

    public static void main(String[] args) {
        ArrayList<Integer> ll= new ArrayList<>();
        ll.add(1);
        ll.add(5);
        ll.add(0);
        ll.add(2);
        Sort_Array_BY_Recusion obj= new Sort_Array_BY_Recusion();
        obj.Sort(ll);
        System.out.println(ll);
    }

    public void Sort(ArrayList<Integer>ll){
       if(ll.size()==1){
           return;
       }
       int temp=ll.get(ll.size()-1);
        ll.remove(ll.size()-1);
        Sort(ll);

        insert(ll,temp);

    }

    public void insert(ArrayList<Integer>ll,int temp){
        if(ll.size()==0 || ll.get(ll.size()-1)<=temp){
            ll.add(temp);
            return;
        }
        int value=ll.get(ll.size()-1);
        ll.remove(ll.size()-1);
        insert(ll,temp);

        ll.add(value);
        return;
    }

}
