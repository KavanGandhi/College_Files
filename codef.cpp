#include<iostream>
using namespace std;

int main()
{
    int no_pep,no_day;
    
    cout<<"Enter people"<<endl;
    cin>>no_pep;
    
    cout<<"Enter day"<<endl;
    cin>>no_day;
    int a[no_pep];
    int k[no_day];
     
    cout<<"Enter values"<<endl;;
    for(int i=0;i<no_pep;i++)
    {
        cin>>a[i];
    }

a[-1]=-2;
    for(int i=0;i<=no_day;i++)
    {
        k[0]=0;
        for(int j=0;j<no_pep;j++)
        {
            if(a[j]==0)
            {
                a[j]=a[j];
            }
            else if(a[j]!=0)
            {
                a[j+1]=a[j+1]+2;
                a[j-1]=a[j-1]+2;
            }
            k[i]=k[i]+a[j];
        }
        cout<<k[i]<<endl;
        
    }

    int final = k[no_day]-k[0];
    cout<<final<<endl;
}