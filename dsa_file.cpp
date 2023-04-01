#include <iostream>
using namespace std;
int main() 
{
    int t,n,m,area,count;
    cin>>t;
    while(t--)
    {
        cin>>n;
        int *a=new int[n];
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        for (int i = 0; i < n-1; i++)
        {
            m = i;
            for (int j = i; j < n; j++)
            {
                if(a[m] > a[j])
                {
                    m = j;
                }
            }
            swap(a[i],a[m]);
        }
        area = 1;
        count = 0;
        for (int i=n-2;i>=0;i--)
        {
            if(a[i]==a[i+1])
            {
                area = area * a[i];
                i--;
                count++;
            }
            if(count==2)
            {
                break;
            }
        }
        if(count == 2)
        {
            cout<<area<<endl;
        }
        else
        {
            cout<<"-1"<<endl;
        }
    }
        cout << "21DCE023 KAVAN GANDHI" << endl;
    return 0;
}
