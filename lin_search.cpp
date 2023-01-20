#include <iostream>
using namespace std;
int linearSearch(int a[], int n, int val) {
    for (int i = 0; i < n; i++) {
        if (a[i] == val) {
            return i + 1;
        }
    }
    return -1;
}

int main() {
    int n;
    cout << "Enter the size of the array: ";
    cin >> n;
    int a[n];
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int val;
    cout << "Enter the value to search for: ";

    cin >> val;
    int result = linearSearch(a, n, val);
    if (result == -1) {
        cout << "Element is not present in array";
    }
    else {
        cout << "Element is present at index " << result;
    }
        cout<<endl<<endl<<"21DCE023 KAVAN GANDHI";
    return 0;
}