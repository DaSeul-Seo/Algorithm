#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main() {
    // Please write your code here.
    double a = 0;

    cin >> a;

    cout << fixed << setprecision(2) << round((a+ 1.5) * 100) /100;
    return 0;
}