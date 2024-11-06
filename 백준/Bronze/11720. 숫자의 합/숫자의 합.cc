#include <stdio.h>

int main() {
	int n;
	scanf("%d ", &n);
	
	int sum = 0;
	char c;

	for (int i = 0; i < n; ++i) {
		scanf("%c", &c);
		sum += c - 48;
	}

	printf("%d\n", sum);
	return 0;
}