#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    int i = 0;

    while(true) {
        cin >> n;
        if (n % 2 != 0) {
            continue;
        } else {
            cout << n / 2 << "\n";
            i++;
        }
        if (i == 3) break;
    }
    return 0;
}