public class peak_mountain {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,4,3,2};
        int ans= check(a);
        System.out.println(ans);
    }
    public static int check(int []a)
    {
        int start=0;
        int end=a.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(a[mid]>a[mid+1])
            {
                // you are in decreasing part of array
                // this may be the ans
                // that's why end!=mid-1
                end = mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
