#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b;
    cin >> a >> b;
    int cnt = 0;

    for (int i = a; i <= b; i++) {
        if (1920 % i == 0 && 2880 % i == 0) {
            cnt++;
            break;
        }
    }

    if (cnt == 0) {
        cout << 0;
    } else {
        cout << 1;
    }
    return 0;
}