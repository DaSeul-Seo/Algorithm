#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;
    int i = 1;

    while(n / i > 1) {
        n = n / i;
        i++;
    }
    cout << i;
}