/*
 * Marcox C. Mediran
 * BSCS1_4
*/

#include <stdio.h>

int main(void) {
    // declare and take input
    int day, start_hour, start_min, call_length;
    float rate, charge;

    printf("What day was the call made? (Input 1-7 for Monday-Sunday): ");
    scanf("%d", &day);

    printf("How long was the call? (Answer in minutes): ");
    scanf("%d", &call_length);

    // if statements, this will decide what would be the rate of the call per minute
    // checks if the day is weekday or weekend, this is a weekend
    // the rate for the weekend does not change so it will not ask when the call was started
    if (day >= 6 && day <= 7) {
        rate = 1.5;
    }
    // this is a weekday
    else {
        // since the call is made in a weekday, there will be different rate depending on the time
        // so the program will ask when what the call started
        printf("[24-hour format] What time was the call started? (Separate hour and minutes with a space. Ex: 14 00 for 2:00 PM): ");
        scanf("%d %d", &start_hour, &start_min);
        
        // convert 24-hour time to minutes
        int exact_time = (start_hour * 60) + start_min;

        // compare time the call started in minutes
        // the range of 06:00-18:00 in minutes is 360th minute to 1080th minute.
        // if the minute the call started is within this range, then the charge is higher
        if (exact_time >= 360 && exact_time <= 1080) {
            rate = 2.5;
        }
        else {
            rate = 2.0;
        }
    }

    // computes the bill
    charge = (float) call_length * rate;
    printf("The caller will be charged %.2f Pesos\n", charge);
    return 0;
}