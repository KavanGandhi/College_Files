#include <iostream>
using namespace std;

int main() {
    int t,m,n,k;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        cin>>m>>n>>k;
        if((n*k)<m)
        {
            cout<<"yes"<<endl;
        }
        else
        {
            cout<<"no"<<endl;
        }
    }
	return 0;
}
