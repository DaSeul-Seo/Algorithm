#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
	int totalNum;

	cin >> totalNum;

	vector<pair<int, int>> v(totalNum);
	vector<pair<int, int>> tmp(totalNum);

	for (int i = 0; i < totalNum; i++) {
		int a;
		cin >> a;
		v[i] = make_pair(i + 1, a);	
	}

	for (int i = 0; i < totalNum; i++) {
		if (i == 0) continue;
		for (int j = v[i].second; j > 0; j--) {
			tmp[0] = make_pair(v[i - j].first, v[i - j].second);
			v[i - j].first = v[i].first;
			v[i - j].second= v[i].second;
			v[i].first = tmp[0].first;
			v[i].second = tmp[0].second;
		}
	}

	for (int i = 0; i < totalNum; i++) {
		cout << v[i].first << " ";
	}

	return 0;
}