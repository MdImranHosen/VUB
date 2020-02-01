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
/////////////////////////////::::::::::::: IP Address ::::::::::\\\\\\\\\\\\\\\\\\\\\\
#include<stdio.h>
void main(){
 int m1,m2,m3,m4;
 printf("Enter the IP Address: ");
 scanf("%d.%d.%d.%",&m1,&m2,&m3,&m4);
 if(m1>=0&&m1<=127){
    printf("\nGiven IP is in Class A");
 } else if(m1>=128&&m1<=191){
    printf("\nGiven IP is in Class B");
  } else if(m1>=192&&m1<=223){
    printf("\nGiven IP is in Class C");
  } else if(m1>=224&&m1<=239){
    printf("\nGiven IP is in Class D");
  } else if(m1>=240&&m1<=255){
    printf("\nGiven IP is in Class E");
  }else{
    printf("\n Error is Input");
  }
}
