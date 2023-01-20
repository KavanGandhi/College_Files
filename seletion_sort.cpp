#include<iostream>
using namespace std;
int main()
{
    int n,min,temp;
    cout<<"Enter length"<<endl;
    cin>>n;

    int a[n];
    cout<<"Enter array elements"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }

    for(int i=0;i<n;i++)
    {
        min=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[min])
            {
                min=j;
            }
            
        }
         if(min!=i)
            {
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
    }
     cout<<endl;
    for(int i=0;i<n;i++)
    {
       cout<<a[i]<<" ";
    }
      cout<<endl<<"21DCE023 KAVAN GANDHI";
}