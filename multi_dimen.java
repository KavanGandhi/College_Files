import java.util.ArrayList;
import java.util.*;
public class multi_dimen {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lst  = new ArrayList<>();

        // first we need to initialize array list like array for example a[3][3] we need to make 
        // a initialize arraylist inside arraylist
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        for(int i=0;i<3;i++)
        {
            lst.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                lst.get(i).add(sc.nextInt());
            }
        }
        System.out.println(lst);
    }
}
