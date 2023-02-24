public class ceiling {
    public static void main(String[] args) {
        // ceiling-smallest element in array greater than or equal to target
        // floor-largest element in array less than or equal to target
        int a[]={2,3,5,9,14,16,18};
        int t=19;
        int ans = check(a,t);
        System.out.println(ans);
    }

   public static int check(int []arr,int tar)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
                
        if(tar>arr[arr.length-1])
        {
            return -1;
        }
        while(start<=end)
        { 
            mid =(start+end)/2;
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
        return arr[start];
    }
}
