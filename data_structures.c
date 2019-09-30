
// Md Imran Hosen
// Web Developer
// www.github.com/MdImranHosen
// www.fb.com/Md.ImranHosen.up
//::::::::::::::::::::::::: Number of Element a array sorting ascending orders... :::::::::::::::::::::::::::::///////////////
#include<stdio.h>
int main(){
  int array[100],c,n,d,swap;
  printf("Enter Number of Element \n");
  scanf("%d",&n);
  printf("Enter %d Integers \n", n);

  for(c=0; c<n; c++)
    scanf("%d", &array[c]);

  for(c=0; c<n-1; c++){
    for(d=0; d<n-c-1; d++){

    printf("\n array[%d]=%d array[%d]=%d\n",d,array[d],d+1,array[d+1]);

        if(array[d] > array[d+1]){
            swap = array[d];
            array[d] = array[d+1];
            array[d+1] = swap;
        }
    }
    printf("\n----------------------------------------------------------\n");
  }

  printf("Sorted List in Ascending Orders \n");

  for(c=0; c<n; c++)
    printf("%d \n", array[c]);
  return 0;
}
/* ////////////::::::::::::::::: Start Input one Integers number with make an array to output Memory Address :::::://///*/
#include<stdio.h>
void mfunction(int imran[], int n);
void main(){
  printf("Enter one Integers Number \n");
  int n;
  scanf("%d",&n);
 int imran[n];

  for(int i=0; i<n; i++){
    imran[i] = i;
  }
  mfunction(imran,n);
}

void mfunction(int imran[], int n){
  for(int i=0; i<n; i++){
    printf("Data value is %d and address %d \n", imran[i],&imran[i]);
  }
}


/* /////////:::::::::::::::::::::: Start Memory address in an array prent elements ::::::::::::::::::*/
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

/*///::::::::::::::::::::::: Binary Search :::::::::::::::::::::////////////*/
#include<stdio.h>
int binarysearch(int arr[], int i, int r, int x){

if(r >= i){
    int mid = i +(r-1)/2;
    if(arr[mid] == x){
        return mid;
    }
    if(arr[mid] > x){
        return binarysearch(arr,i,mid-1,x);
    }
    return binarysearch(arr,mid+1,r,x);
}
 return -1;
}
int main(void){
int arr[] = {67,2,3,4,10,40,70,80};
int n = sizeof(arr) / sizeof(arr[0]);
int x = 67;
int result = binarysearch(arr,0,n-1,x);
(result==-1) ? printf("Element is none present in array \n") :
    printf("Element is Present al index %d \n", result);
    return 0;
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

/*    Recursion in C   */
#include<stdio.h>
int mfun(int n){
  if(n==0){
    return 0;
  } else if(n==1){
   return 1;
  } else {
   return 1 + mfun(n-1);
  }
}

int main()
{
    int n;
    printf("Enter Integer Number: ");
    scanf("%d",&n);
    printf("%d", mfun(n));
    return 0;
}
////////::::::::::::::::::: Insert into a array element ::::::::::::;;;;
#include <stdio.h>
int main() {
  int n;
  printf("Enter Number of Element: ");
   scanf("%d",&n);
   int imran[n];
   printf("Enter %d Integers \n", n);

  for(int i = 0; i < n; ++i) {
     scanf("%d", &imran[i]);
  }

  printf("array[] = { ");
  for(int i = 0; i < n; ++i) {
     printf("[%d]=%d, ",i, imran[i]);
  }
  printf(" };");
  return 0;
}
////////////:::::::::::::::: Input An array Element to Average number output :::::::::::::://////////////
#include<stdio.h>
int main()
{
    int i, n, sum=0, average;
    printf("Enter array Element Number: ");
    scanf("%d",&n);
    int imran[n];
    for(i=0;i<n; i++){
        printf("Enter Number%d : ",i+1);
        scanf("%d",&imran[i]);
        sum += imran[i];
    }
    average = sum/n;
    printf("Average Number %d ", average);
    return 0;
}

