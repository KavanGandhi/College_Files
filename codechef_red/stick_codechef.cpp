#include <iostream>
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int arr[]={6,2,5,5,4,5,6,3,7,6};
        int x,y,sum,stick=0,rem;
        cin>>x;
        cin>>y;
        sum=x+y;
        while(sum!=0){
            rem=sum%10;
            stick=stick+arr[rem];
            sum=sum/10;
        }
        
        cout<<stick<<endl;
    }
	return 0;
}
