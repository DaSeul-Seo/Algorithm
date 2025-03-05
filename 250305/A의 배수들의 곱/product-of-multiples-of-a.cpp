#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b;
    cin >> a >> b;
    int rst = 1;

    for (int i = 1; i <= b; i++) {
        if (i % a != 0) continue;
        rst *= i;
    }

    cout << rst;
    return 0;
}