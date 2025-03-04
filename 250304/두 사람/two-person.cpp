#include <iostream>
#include <string>
using namespace std;

int main() {
    // Please write your code here.
    int age1, age2;
    char gender1, gender2;

    cin >> age1 >> gender1 >> age2 >> gender2;

    if ((age1 >= 19 && gender1 == 'M') || (age2 >= 19 && gender2 == 'M')) {
        cout << 1;
    }else {
        cout << 0;
    }
    return 0;
}