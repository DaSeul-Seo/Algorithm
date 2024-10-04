#include <iostream>
#include <string>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

int main() {
	int totalNum;
	vector<int> v;

	cin >> totalNum;

	for (int i = 0; i < totalNum; i++) {
		priority_queue<int> pq;
		queue<pair<int, int>> q;
		int dataCnt;	// 데이터 수
		int findIndex;	// 찾을 인덱스 수
		int data;		// 데이터 값
		int rstCnt = 0;

		cin >> dataCnt >> findIndex;

		for (int j = 0; j < dataCnt; j++) {
			cin >> data;
			pq.push(data);
			q.push(make_pair(j, data));
		}

		for (;;) {
			if (q.front().second == pq.top()) {
				if (q.front().first == findIndex) {
					rstCnt++;
					v.push_back(rstCnt);
					break;
				}
				else {
					rstCnt++;
					pair<int, int> p = q.front();
					q.push(p);
					q.pop();
					pq.pop();
				}
			}
			else {
				pair<int, int> p = q.front();
				q.push(p);
				q.pop();
			}
		}
	}

	for (int i = 0; i < totalNum; i++) {
		cout << v[i] << " ";
	}

	return 0;
}