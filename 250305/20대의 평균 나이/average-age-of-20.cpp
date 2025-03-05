#include <iostream>
#include <iomanip>
#include <math.h>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    double sum = 0;
    int cnt = 0;

    while (true) {
        cin >> n;
        if (n / 10 != 2) break;
        sum += n;
        cnt++;
    }

    double rst = sum / cnt;
    cout << fixed << setprecision(2) << round(rst * 100) / 100;

    return 0;
}