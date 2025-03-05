#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;

    for (int i = 1; i <= 100; i++) {
        cin >> n;
        if (n == 1) {
            cout << "John\n";
        } else if (n == 2) {
            cout << "Tom\n";
        } else if (n == 3) {
            cout << "Paul\n";
        } else if (n == 4) {
            cout << "Sam\n";
        } else {
            cout << "Vacancy";
            break;
        }
    }
    return 0;
}