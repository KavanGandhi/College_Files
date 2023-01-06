public class count_evenno {
    public static void main(String[] args) {
        int a[]={190,22,1,1029,22};
        int q,c=0;
        int []count=new int[5];

        for(int i=0;i<a.length;i++)
        {
            q=1;
            count[i]=0;
            while(q!=0)
            {
                q=a[i]/10;
                a[i]=q;
                count[i]++;

            }
        }

        for(int i=0;i<a.length;i++)
        {
            if(count[i]%2==0)
            {
                System.out.println(i+" index is even");
                c++;
                
            }


            else{
                System.out.println(i+" index is odd");
            }
            
        }
        System.out.println(c+" Even no.s");
    }
}
