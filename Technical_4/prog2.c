#include <stdio.h>

int main() {
    int n1 = 56789, n2 = 6578, last1, last2;
    int hashtable[10] = {0};

    while(n1 != 0 || n2 != 0) {
        last1 = n1 % 10;
        last2 = n2 % 10;

        hashtable[last1]++;
        hashtable[last2]--;

        n1 /= 10;
        n2 /= 10;
    }

    for(int x = 0; x < 10; x++) {
        if(hashtable[x] != 0) {
            printf("Frequency not matching.\n");
            return 0;
        }
    }

    printf("Frequency is matching.\n");

    return 0;
}