#include <iostream>
#include <string>
using namespace std;

int main() {
    // Please write your code here.
    int age1, age2;
    string gender1, gender2;

    cin >> age1 >> gender1 >> age2 >> gender2;

    if (age1 >= 19 || age2 >= 19 || gender1 == "M" || gender2 == "M") {
        cout << 1;
    }else {
        cout << 0;
    }
    return 0;
}