#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int a[6];
        
        for(int i=0;i<6;i++)
        {
            cin>>a[i];
        }
        int c1=0;
        int c2=0;
           if((a[0]==a[2] || a[0]==a[3]) && (a[1]==a[2] || a[1]==a[3]))
           {
              cout<<"1"<<endl;
           }
           else if((a[0]==a[4] || a[0]==a[5]) && (a[1]==a[4] || a[1]==a[5]))
           {
              cout<<"2"<<endl;
           }
           else
           {
               cout<<"0"<<endl;
           }
        
        
    }
	return 0;
}
