// c code to solve Tower of Hanoi problem.

#include<stdio.h>
void TowerOFHanoi(int n, char from_disk, char to_disk, char ausk_disk){

     if(n>0){
        if(n == 1){
            printf("\n Movie disk 1 from rod %c to rod %c ",from_disk,to_disk);
            return;
        }
         TowerOFHanoi(n-1,from_disk,ausk_disk,to_disk);
         printf("\n Movie disk %d from to %c to rod %c",n, from_disk,to_disk);
         TowerOFHanoi(n-1,ausk_disk,to_disk,from_disk);
     }


}

int main(){
  int n;
  printf("Enter Integer Number: ");
  scanf("%d",&n);

  TowerOFHanoi(n,'A','C','B'); //A is disks From and C to  A,B,C rod ....
  return 0;
}
