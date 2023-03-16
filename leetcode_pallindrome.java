public class leetcode_pallindrome 
{
    public static boolean isPalindrome(int x)
    {
        if(x<0){
            return false;
        }
      
        int len=0;
        int temp = x;

        while(temp!=0){
            len++;
            temp = temp/10;
        }

        int n = len;
        int a[] = new int[len];
        while(x!=0)
        {
            a[n-1]=x%10;
            x=x/10;
            n--;
        }   
        int i=0;
        int j;
        for(j=len-1; j>=len/2 && i<=len/2;)
        {
            if(a[i]!=a[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean b = isPalindrome(121);
        System.out.println(b);

    }
}

