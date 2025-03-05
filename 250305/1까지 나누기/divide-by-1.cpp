#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;
    int i = 1;
    int cnt = 1;

    while(n / i > 0) {
        n = n / i;
        cnt++;
        i++;
    }

    cout << cnt;
    return 0;
}