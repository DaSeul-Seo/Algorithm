#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;
    int rst = 0;

    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            rst += i;
        }
    }

    if (rst == n) {
        cout << "P";
    } else {
        cout << "N";
    }

    
    return 0;
}