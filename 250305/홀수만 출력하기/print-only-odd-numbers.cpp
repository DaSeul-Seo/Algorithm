#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    int a;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> a;
        if (a % 3 == 0) {
            cout << a << "\n";
        }
    }
    return 0;
}