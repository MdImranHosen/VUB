/* Start Memory address in an array prent elements */
#include<stdio.h>
void firstfunction(int imran[]);
void firstdetails(int imran[]);
void main(){
   int imran[12];

   for(int i = 0; i<12; i++){
    imran[i] = i;
   }
   firstfunction(imran);
   firstdetails(imran);
}

void firstfunction(int imran[]){
   for(int i=0; i<12; i++){
    printf("Value in the array %d \n", imran[i]);
   }

}

void firstdetails(int imran[]){
   for(int i=0; i<12; i++){
    printf("Value in the array %d and address is %d \n", imran[i],&imran[i]);
   }
}

/* end Start Memory address in an array prent elements */

#include<stdio.h>
void printaray(int x[]);

void main(){
  int x[15];

  for(int i = 0; i<15; i++){
    x[i] = i;
  }
  printaray(x);
}
void printaray(int x[]){
 for(int i=0; i<15; i++){
    printf("value in the array %d \n", x[i]);
 }

  for(int i=0; i<15; i++){
    printf("value in the array %d and address is %d \n", x[i],&x[i]);
  }
}

/* second way memory address array print */
#include<stdio.h>
void mfunction(int imran[]);
void main(){
     int imran[10];

     for(int i=0; i<10; i++){
        imran[i] = i;
     }
     mfunction(imran);
}
void mfunction(int imran[]){
  for(int i=0; i<10; i++){
    printf("Value in the %d and Address %d \n", imran[i],&imran[i]);
  }
}

/* Third way memory address array print */
#include<stdio.h>
int main(){
  //1
  int myArray[9] = {1,2,3,4,5,6,7,8,9};
  int i;
  //2
  for(i=0;i<9;i++){
    //3
    printf("Address for %d is %d\n",myArray[i],&myArray[i]);
  }
}

/* End memory address */

/* Sorted list in ascending order */
#include<stdio.h>
int main()
{
    int array[100], n, c,d, swap;
    printf("Enter Number of Elements\n");
    scanf("%d", &n);
    printf("Enter %d integers\n", n);
    for(c=0; c<n; c++)

      scanf("%d", & array[c]);


    for(c=0; c<n-1; c++)
    {
    for(d=0; d<n-c-1; d++)

       {
           if(array[d]> array[d+1]) /*For Decreasing order use */
        {
            swap = array[d];
            array[d] = array[d+1];
            array[d+1] = swap;
        }

       }
    }
    printf("Sorted list in ascending order: \n");
    for(c=0; c<n; c++)

        printf("%d\n", array[c]);
        return 0;

}

/* Sorted list in Descending order */
#include<stdio.h>
int main()
{
    int array[100],c,n,d,swap;
    printf("Enter Number of Element,s \n");
    scanf("%d", &n);

    printf("Enter %d Integers \n", n);

    for(c=0; c<n; c++)
        scanf("%d", &array[c]);
    for(c=0; c<n-1; c++)
    {
        for(d=0; d<n-c-1; d++)
        {
            if(array[d] < array[d+1])
            {
                swap = array[d];
                array[d] = array[d+1];
                array[d+1] = swap;
            }
        }
    }

    printf("Sorted list in Descending orders \n");

    for(c=0; c<n; c++)
        printf("%d \n", array[c]);
    return 0;
}
