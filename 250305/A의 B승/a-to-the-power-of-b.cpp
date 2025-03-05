#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b;
    int rst = 1;
    cin >> a >> b;

    for (int i = 0; i < b; i++) {
        rst = rst * a;
    }

    cout << rst;
    return 0;
}