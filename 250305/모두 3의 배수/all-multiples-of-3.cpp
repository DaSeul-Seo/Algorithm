#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    int cnt = 0;

    for (int i = 0; i < 5; i++) {
        cin >> n;
        if (n % 3 != 0) {
            cnt++;
            break;
        }
    }

    if (cnt == 0) {
        cout << 1;
    } else {
        cout << 0;
    }
    return 0;
}