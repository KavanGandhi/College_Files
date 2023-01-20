#include <iostream>
using namespace std;
void quicksort(int number[25], int first, int last){
    int i, j, pivot, temp;
    if (first < last){
        pivot = first;
        i = first;
        j = last;
        while (i < j){
            while (number[i] <= number[pivot] && i < last)
                i++;
            while (number[j] > number[pivot])
                j--;
            if (i < j){
                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
        }
        temp = number[pivot];
        number[pivot] = number[j];
        number[j] = temp;
        quicksort(number, first, j - 1);
        quicksort(number, j + 1, last);
    }
}
int main(){
    int i;
    int size;
    cout<<"**********QUICK SORT********\n";
    cout << "Enter the size of the array: ";
    cin >> size;
    int number[size];
    cout<<"Enter the element in the array:\n";
    for (int i = 0; i < size; i++) {
        cin >> number[i];
    }
    cout<<"BEFORE SORTING\n";
    for (int i = 0; i < size; i++) {
        cout<<number[i]<<" ";    }
    quicksort(number, 0, size - 1);
    cout<<"\nAFTER SORTING\n";
    for (int i = 0; i < size; i++) {
        cout << number[i] << " ";    }
    cout << endl;
    cout<<endl<<"21DCE023 KAVAN GANDHI";
    return 0;
}
