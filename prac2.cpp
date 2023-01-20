#include<iostream>
using namespace std;
int main()
{
    int n,c,k,i,j,max;
    int sum;
    

    cout<<"Enter no. of objects";
    cin>>n;
    int count[n],a[n];
    cout<<"Enter capacity of of bag";
    cin>>c;

    cout<<"Enter minimum capacity";
    cin>>k;

    cout<<"Enter elements";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        count[i]=0;
        sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=a[j];
            if(sum>c)
            {
                break;
            }
            count[i]++;
        }
        if(sum<k)
        {
            count[i]=0;
        }
        
    }    
max=count[0];
    for(i=0;i<n;i++)
    {
        if(count[i]>max)
        {
            max=count[i];
        }
    }

    cout<<"Maximum no."<<max<<endl;

}