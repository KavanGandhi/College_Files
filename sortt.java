import java.util.*;
public class sortt {
    static void sort(int a[])
    {
        int temp;
        // INSERTION SORT
        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=i+1;j<a.length;j++)
        //     {
        //         if(a[i]>a[j])
        //         {
        //             temp=a[i];
        //             a[i]=a[j]; 
        //             a[j]=temp; 
        //         }             
        //     }
        // }

        // BUBBLE SORT
        // 1 0 -1 2 -5
        // 0 -1  1 -5 2
        //-1 0 -5 1 2 

        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=0;j<a.length;j++)
        //     {
        //        if(a[j]>a[j+1])
        //        {
        //         temp=a[j];
        //         a[j]=a[j+1];
        //         a[j+1]=temp;
        //        }
        //     }

        // }

        for(int i=0;i<a.length;i++)
        {
            
        }


        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size:");
        n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        sort(arr);
    }
}
