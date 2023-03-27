#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t,n,k,c;
	cin>>t;
	while(t--)
	{
	   
	    c=0;
	    cin>>n>>k;
	    int a[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }
	    for(int i=0;i<n;i++)
	    {
	       if(a[i]>k)
	       {
	           c++;
	       }
	    }
	    cout<<c<<endl;
	    
	}
	return 0;
}
