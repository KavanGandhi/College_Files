#include <iostream>
using namespace std;

int main() {
    int decimal, binary[20], i = 0;
    cout << "Enter a decimal number: ";
    cin >> decimal;
    while (decimal > 0) {
        binary[i] = decimal % 2;
        decimal = decimal / 2;
        i++;
    }
    cout << "Binary number is: ";
    for (int j = i - 1; j >= 0; j--) {
        cout << binary[j];
    }
    return 0;
}