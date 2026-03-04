#include <stdio.h>

int main() {
    int prices[] = {15, 3, 2 ,1, 6, 11, 8}; // ans = 10
    // int prices[] = {7, 4, 9, 1, 3, 2}; ans = 5
    int len = sizeof(prices) / sizeof(int);
    int minValue = 0, maxProfit = 0;

    for (int i = 0; i < len; i++) {
        if (prices[i] < minValue) {
            minValue = prices[i];
        }
        int profit = prices[i] - minValue;

        if (profit > maxProfit) {
            maxProfit = profit;
        }
    }

    printf("Maximum profit = %d\n", maxProfit);

    return 0;
}