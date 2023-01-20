#include <iostream>
using namespace std;
int main()
{
    int ar[10];
    int len;
    cout<<"enter length: ";
    cin>>len;
    for (int i=0;i<len;i++)
    {
        cout<<"enter no. : ";
        cin>>ar[i];
    }
    cout<< "sorted array:  "<<endl;
    int temp;
    for(int i=0;i<len;i++)
    {
        for(int j=0;j<len-1;j++){
            if(ar[j]>ar[j+1])
            {
                temp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] =  temp;
            }
        }
    }
    for (int i=0;i<len;i++)
    {
        cout<<ar[i]<<" ";
    }
    cout<<"21DCE023 KAVAN GANDHI";
    return 0;
}
