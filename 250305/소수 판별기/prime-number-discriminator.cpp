#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;
    int cnt = 0;

    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            cnt++;
            break;
        }
    }

    if (cnt == 0) {
        cout << "P";
    } else {
        cout << "C";
    }
    return 0;
}