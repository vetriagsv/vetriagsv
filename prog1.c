#include<stdio.h>
#include<conio.h>
void main()
{
    int n;
    printf("enter the n value");
    scanf("%d",&n);
    if(n>0)
        printf("n is positive",n);
    else if(n<0)
    printf("n is negative",n);
     else
     printf("n is zero",n);
}
