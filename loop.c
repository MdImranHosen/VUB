/* ///////////////////////////////// FOR LOOP //////////////////////// */
#include<stdio.h>
void main(void)
{
    int i;
    for(i=0;i<5;i++)
    {
        printf("For Loop has looped:: %d :: Times\n", i);
    }
}

//-------------------------------------------------------------------------

#include<stdio.h>
void main()
{
    int i=0;
    int j=0;
    for(;i<5;i++)
    {
        printf("Value of is:: %d\n",j);
        j++;
    }
}

/* /////////////////////////////////////////////// WHILE LOOP //////////////////// */

#include<stdio.h>
void main()
{

    int n;
    printf("Enter a Number :: ");
    scanf("%d",&n);
    while(n>0)
    {
        printf("Decremented value is:: %d\n", n);
        n--;
    }
}

/* ///////////////////////////////////////////////DO WHILE LOOP //////////////////// */
#include<stdio.h>
void main()
{
    int n;
    printf("Number of times to display Hello::: ");
    scanf("%d",&n);
    do{
        printf("Result is :: %d\n",n);
        n--;
    }while(n>0);
}
/* ///////////////////////////////////////////////RETURN STATEMENT //////////////////// */

#include<stdio.h>
void main()
{
    int x,y,h;
    x=10;
    y=20;
    h=max(x,y);
    printf("The Highest number is:: %d \n",h);


}
 int max(int l, int m)
    {
        if(l>m)
        {
            return l;
        }
        else
        {
          return m;
        }
    }
////////////////////// IF condition /////////////
#include<stdio.h>
void main()
{
    int number;
    printf("Enter an inttger: ");
    scanf("%d",&number);

    if(number % 2 == 0)
    {
      printf("%d is even Number", number);
    }
    else
    {
     printf("%d is old Number.", number);
    }
    return 0;
}

