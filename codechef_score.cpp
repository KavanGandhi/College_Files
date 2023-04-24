#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t,n;
    cin>>t;
    while(t--)
    {
        cin>>n;
        int p[n],s[n],max[n];
        for(int i=0;i<n;i++)
        {
            cin>>p[i]>>s[i];
        }
        int sum = 0;
        for(int i=0;i<9;i++)
        {
            int max=0;
            for(int j=0;j<n;j++)
            {
                if(p[i]!=9 || p[i]!=10 || p[i]!=11)
                {
                    if(i==p[j])
                    {
                        if(max<s[j])
                        {
                            max=s[j];
                        }
                    }
                }
            }
            sum+=max;
        }
        cout<<sum<<endl;
    }
	return 0;
}