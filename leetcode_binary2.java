public class leetcode_binary2 {
    public static void main(String[] args) {
        int [] nums ={1,3,5,6};
        int target=2;
        int b= search( nums, target);
        System.out.println("ans "+b);

    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
        
    }
}
