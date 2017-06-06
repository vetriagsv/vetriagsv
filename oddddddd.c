#include<stdio.h>
#include<conio.h>
void main()
{
    int n,m,i;
    printf("Enter the first interval:");
    scanf("%d",&n);
    printf("Enter the second interval:");
    scanf("%d",&m);
    for( i=n;i<=m;i++)
    {
        if(i/2==0)
        {
            printf("ODD no. are :%d\t",i);
        }
    }
}
