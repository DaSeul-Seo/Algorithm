#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Node {
public:
	Node* up;
	Node* down;
	int data;

	Node() {
		this->up = NULL;
		this->down = NULL;
		this->data = 0;
	}

	~Node() {}
};

class Stack {
public:
	Node* topn;
	int stackSize;

	Stack() {
		this->topn = NULL;
		this->stackSize = 0;
	}

	~Stack() {}

	// 정수 X를 스택에 넣는 연산이다.
	void push(Node* node) {
		if (this->topn == NULL) {
			this->topn = node;
		}
		else {
			this->topn->up = node;
			node->down = this->topn;
			this->topn = node;
		}
		stackSize++;
	}

	// 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	int pop() {
		if (stackSize == 0) {
			return -1;
		}
		else {
			int value = this->topn->data;
			this->topn = this->topn->down;
			stackSize--;
			return value;
		}
	}

	// 스택에 들어있는 정수의 개수를 출력한다.
	int size() {
		return stackSize;
	}

	// 스택이 비어있으면 1, 아니면 0을 출력한다.
	int empty() {
		if (stackSize == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	// 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	int top() {
		if (this->topn == NULL) {
			return -1;
		}
		else {
			return this->topn->data;
		}
	}
};

int main() {
	Stack* s = new Stack();
	vector<int> v;
	int totalNum;

	cin >> totalNum;

	for (int i = 0; i < totalNum; i++) {
		Node* node = new Node();
		string funStr;
		int funNum;

		cin >> funStr;


		if (funStr == "push") {
			cin >> funNum;
			node->data = funNum;
			s->push(node);
		}
		else if (funStr == "pop") {
			v.push_back(s->pop());
		}
		else if (funStr == "size") {
			v.push_back(s->size());
		}
		else if (funStr == "empty") {
			v.push_back(s->empty());
		}
		else if (funStr == "top") {
			v.push_back(s->top());
		}
		else {
			continue;
		}
	}

	for (int i = 0; i < v.size(); i++) {
		cout << v[i] << "\n";
	}
}