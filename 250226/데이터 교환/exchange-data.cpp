#include <iostream>

using namespace std;

int main() {
    int a = 5, b = 6, c = 7;
    int t = 0;

    t = a;
    a = c;
    c = t;
    t = b;
    b = c;
    c = t;
    
    cout << a << "\n" << b << "\n" << c;
    return 0;
}