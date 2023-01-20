// selection sort
#include<iostream>
using namespace std;

int main()
{
    int a[10];
    int n;
    cout<<"enter length : ";
    cin>>n;
    for (int i=0;i<n;i++)
    {
        cout<<"enter   :  ";
        cin>>a[i];
    }
    int temp;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp = a[i];
                a[i] =  a[j];
                a[j] = temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    cout<<endl<<"21DCE023 KAVAN GANDHI";

}