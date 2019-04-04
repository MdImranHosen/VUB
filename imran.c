#include<stdio.h>
int main()
{
    int num1, num2, total;
    printf("Enter two Number: ");
    scanf("%d %d",&num1, &num2);
    total = num1 + num2;
    printf("%d + %d = %d", num1, num2, total);
    return 0;
}
