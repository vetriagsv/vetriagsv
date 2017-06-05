#include<stdio.h>
#include<conio.h>
void main()
{
    int count,n;
    printf("enter the n value");
    scanf("%d",&n);
    while(n%10!=0)
    {
        ++count;
    }
    printf("",count);
    getch();
}
