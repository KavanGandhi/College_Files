#include <iostream>
using namespace std;
//Insertion sort
void insertionSort(int arr[], int n){
    int i, temp, j;
    for (i = 1; i < n; i++)    {
        temp = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > temp)     
           {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = temp;
    }
    cout<<"\nAFTER SORTING\n";
    for (i = 0; i < n; i++)
        cout<<arr[i]<<" ";
}
int main(){
    int arr[] = {12, 11, 13, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);
    int i;
    cout<<"*********Insertion Sort********";
    cout<<"\nBEFORE SORTING\n";
    for (i = 0; i < n; i++)
        cout<<arr[i]<<" ";
    insertionSort(arr, n);
    cout<<"\n21DCE023 KAVAN GANDHI";
    return 0;
}