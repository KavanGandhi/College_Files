public class binary_search {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,11,12,30,33};
        int t=2;
        int ans = check(a,t);
        System.out.println(ans);
    }

   public static int check(int []arr,int tar)
    {
        int start=0;
        int end=arr.length-1;
        // checking for ascending or descending
        boolean as_des=arr[start]<arr[end];
        int mid;
        while(start<=end)
        { 
            mid =(start+end)/2;
            if(tar==arr[mid])
            {
                return mid;
            }
            else if(as_des)
            {
                if(tar<arr[mid]){
                    end=mid-1;
                }
                if(tar>arr[mid]){
                start=mid+1;
            }
            }
            else{
                if(tar>arr[mid])
                {
                    end=mid-1;
                }
                    if(tar<arr[mid]){
                    start=mid+1;
                }
            }
            
        }
        return -1;

    }
}
