#include<iostream>
using namespace std;

int main(){
    int size,i,j,k,z,count;
    cout<<"Enter size of array"<<endl;
    cin>>size;

    cout<<"Enter size of sliding window";
    cin>>k;

    int a[size];
    cout<<"Enter arrray elements"<<endl;
    for(i=0;i<size;i++)
    {
        cin>>a[i];
    }

    for(i=0;i<size-k+1;i++)
    {
        count=0;
        for(j=i;j<k+i;j++)
        {
            for(z=j+1;z<k+i;z++)
            {
                if(a[z]==a[j])
                {
                    break;
                }
            }
            if(z==(k+i))
            {
                count++;
            }
        }
        cout<<count;
    }
    
}