
/* Md. Imran Hosen
   Id: 2619150011
   www.github.com/MdImranHosen
*/
#include <stdio.h>
#include <string.h>
int main() {
   char keyword[32][10]={
      "auto","double","int","struct","break","else","long",
      "switch","case","enum","register","typedef","char",
      "extern","return","union","const","float","short",
      "unsigned","continue","for","signed","void","default",
      "goto","sizeof","voltile","do","if","static","while"
   } ;
   char imran_str[100];
   scanf("%s", imran_str);
   int flag=0,i;
   for(i = 0; i < 32; i++) {
      if(strcmp(imran_str,keyword[i])==0) {
         flag=1;
      }
   }
   if(flag==1)
      printf("%s is a keyword",imran_str);
   else
      printf("%s is not a keyword",imran_str);
}
