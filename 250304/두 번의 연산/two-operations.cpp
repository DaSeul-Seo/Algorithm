#include <iostream>

using namespace std;

int main() {
    int a;
    int rst;

    cin >> a;

    if (a % 2 != 0) {
        a = a + 3;
    }

    if (a % 3 == 0) {
        rst = a/3;
    }

    cout << rst;

    return 0;
}