// n = 6
// Arrival Times: 900 940 950 1100 1500 1800
// Departure Times: 910 1200 1120 1130 1900 2000
#include <stdio.h>

int main()
{
    int n = 6;
    int arr[] = {900, 940, 950, 1100, 1500, 1800};
    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

    int i = 0, j = 0, platform = 0, maxPlatform = 0;

    while (i < n && j < n)
    {
        if (arr[i] < dep[j])
        {
            platform++;
            i++;
            if (platform > maxPlatform)
            {
                maxPlatform = platform;
            }
            else
            {
                platform--;
                j++;
            }
        }
    }

    printf("Maximum Platformd required = %d\n", maxPlatform);

    return 0;
}
