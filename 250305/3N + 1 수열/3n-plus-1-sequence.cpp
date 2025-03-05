#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    int cnt = 0;
    cin >> n;

    while(n != 1) {
        if (n % 2 == 0) {
            n = n / 2;
            cnt++;
        } else {
            n = (n * 3) + 1;
            cnt++;
        }
    }

    cout << cnt;
    return 0;
}