#include<stdio.h>
#include<conio.h>
void main()
{
    int a;
    printf("enter the a value");
    scanf("d",&a);
    if(a%2==0)
        printf("%d is even",a);
    else if(a%2!=0)
     printf("%d is odd",a);
    else
        printf("%d is zero",a);

}

