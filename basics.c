// Take 5 numbers, store in an array and display them
// Date : 28-AUG-2025

#include<stdio.h>

void main( )
{
 int a[5];
 int i;


    for(i = 0; i < 5; i ++)
    {
        printf("Enter a number :");
        scanf("%d", &a[i]);
    }

    for(i = 0; i < 5; i ++)
    {
        printf("%d ", a[i]);
    }

}
