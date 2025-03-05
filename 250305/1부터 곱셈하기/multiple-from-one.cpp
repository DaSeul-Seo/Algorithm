#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int sum = 1;

    for (int i = 1; i <= 10; i++) {
        sum *= i;
        if (sum >= n) {
            cout << i;
            break;
        }
    }

    return 0;
}