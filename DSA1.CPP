#include <iostream>
using namespace std;
const int ARRAY_SIZE = 20;
const int MIN_VAL = 100000;
const int MAX_VAL = 999999;
const int HASH_CONST = 18;
const int HASH_SHIFT = 2;
int hash_func(int x)
{
    return (x % HASH_CONST) + HASH_SHIFT;
}
int main()
{
    int arr[ARRAY_SIZE] = {0};
    int collisions = 0;
    cout << "Enter 15 different values between " << MIN_VAL << " and " << MAX_VAL << ":" << endl;
    for (int i = 0; i < 15; i++)
    {
        int val;
        do
        {
            cout << "Value " << i + 1 << ": ";
            cin >> val;
            if (val < MIN_VAL || val > MAX_VAL)
            {
                cout << "Value must be between " << MIN_VAL << " and " << MAX_VAL << endl;
            }
        } while (val < MIN_VAL || val > MAX_VAL);
        int key = hash_func(val);
        while (arr[key] != 0)
        {
            key++;

            collisions++;
            if (key >= ARRAY_SIZE)
            {
                key = 0;
            }
        }
        arr[key] = val;
    }
    cout << "Number of collisions: " << collisions << endl;
    cout << "Array values:" << endl;
    for (int i = 0; i < ARRAY_SIZE; i++)
    {
        cout << "arr[" << i << "] = ";
        if (arr[i] == 0)
        {
            cout << "EMPTY" << endl;
        }
        else
        {
            cout << arr[i] << endl;
        }
    }
    cout << "\n21DCE023 KAVAN GANDHI" << endl;
    return 0;
}
