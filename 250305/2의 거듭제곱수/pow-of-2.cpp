#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int cnt = 1;

    while (n != 2) {
        n = n / 2;
        cnt++;
    }
    cout << cnt;

    return 0;
}