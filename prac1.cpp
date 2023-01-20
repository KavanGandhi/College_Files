
#include <iostream>

using namespace std;

int binarysearch(int a[],int st,int end,int x)
{
    int mid = (st+end)/2;

    if((st==end) && (a[mid]!=x))
    return -1;

    else if(a[mid] == x) return 1;

    else if(a[mid] > x)
    {
        mid --;
        binarysearch(a,st,mid,x);

    }

    else if(a[mid] < x)
    {
        mid ++;
        binarysearch(a,mid,end,x);
    }

}

int main()
{
    int ar[10];
    int s,n;
    cout<<"enter array size : ";
    cin>>s;

    for (int i=0;i<s;i++)
    {
        cout<<"enter   :  ";
        cin>>ar[i];
    }

    cout<<"enter number: ";
    cin>>n;

    int res = binarysearch(ar,0,s,n);
    cout<<res;

    if(res == 1) cout<<"yes";
    else cout<<"no";
    cout<<endl<<endl<<"21DCE023 KAVAN GANDHI";
    return 0;
}