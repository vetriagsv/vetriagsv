#include<stdio.h>
#include<conio.h>
void main()
{
    int a,r,rev,b;
    printf("enter the value:");
    scanf("%d",&a);
    while(a!=0)
    {
        r=a%10;
        b=a/10;
        rev=(b*10)+r;
    }
    if(rev==a)
    {
        printf("polindrome");
    }
    else
    {
        printf("not polyndrome");
    }
}
