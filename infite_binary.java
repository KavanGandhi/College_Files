public class infite_binary {
    public static void main(String[] args) {
        int [] a= {2,3,4,5,6,7,10,13,15,18,20};//it's an infinite array we dont now length of array
        int target = 15;
        int b= ans(a,target);
        System.out.println("ans is "+b);

    }

    public static int ans(int arr[],int t)
    {
        int start=0;
        int end=1;
        while(t>arr[end])
        {
            start= end+1;
            // double the box value
            // end = previous end + sizeofbox*2;
            end = end + (end-start+1);
            
        }
       return search(arr,t,start,end);
    }

    public static int search(int arr[],int tar,int start,int end)
    {
        while(start<=end)
        { 
            int mid =(start+end)/2;
            if(tar==arr[mid])
            {
                return mid;
            }
            if(tar<arr[mid])
            {
                end=mid-1;
            }
            if(tar>arr[mid])
            {
                start=mid+1;
            }     
        }
        return -1;

    }

}
