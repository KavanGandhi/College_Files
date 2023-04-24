#include<iostream>
using namespace std;

int top=-1;
const int n=5;
int a[n];

void push()
{
    int ele;
    cin>>ele;
    if(top==n-1)
    {
        cout<<"Overflow"<<endl;
    }
    else
    {
        top++;
        a[top]=ele;
    }
}

void pop()
{
    if(top==-1)
    {
        cout<<"Underflow"<<endl;
    }
    else
    {
        cout<<"Poped "<<a[top]<<endl;
        top--;
    }
}

void display()
{
    if(top>-1)
    {
        for(int i=0;i<top+1;i++)
        {
            cout<<a[i]<<" ";
        }
    }
}

int main()
{
    int input;
    do
    {
        
        cout<<"push-1 pop-2 display-3 exit-4"<<endl;
        cin>>input;
        
        switch(input)
        {
            case 1:
            {
                push();
                break;
            }
             case 2:
            {
                pop();
                break;
            }
            case 3:
            {
                display();
                break;
            }
            case 4:
            {
                cout<<"Exit";
                break;
            }
            default:
            {
                cout<<"Wrong number";
                break;
            }
        }

    } while (input!=4);
    
}