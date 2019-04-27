#include<stdio.h>
void main()
{
    int xxx, first, second, total;

    printf("Enter 1 = Addition , 2 = Subtraction, 3 = Multiplication and 4 = Division: ");
    scanf("%d",&xxx);
    if(xxx == 1){
       printf("Enter First Number: ");
       scanf("%d",&first);
       printf("Enter Second Number: ");
       scanf("%d",&second);

       total = first+second;
       printf("%d + %d = %d", first, second, total);
    }
    else if(xxx == 2)
    {
         printf("Enter First Number: ");
       scanf("%d",&first);
       printf("Enter Second Number: ");
       scanf("%d",&second);

       total = first-second;
       printf("%d - %d = %d", first, second, total);
    }
    else if(xxx == 3)
    {
         printf("Enter First Number: ");
       scanf("%d",&first);
       printf("Enter Second Number: ");
       scanf("%d",&second);

       total = first*second;
       printf("%d * %d = %d", first, second, total);
    }
    else if(xxx == 4)
    {
      printf("Enter First Number:: ");
       scanf("%d",&first);
       printf("Enter Second Number: ");
       scanf("%d",&second);

       total = first/second;
       printf("%d / %d = %d", first, second, total);
    }
    else
    {
        printf("Wrong Number input");
    }


    return 0;
}
