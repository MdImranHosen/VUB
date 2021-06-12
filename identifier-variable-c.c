/* Md. Imran Hosen
   Id: 2619150011
   www.github.com/MdImranHosen
*/
#include <stdio.h>
#include <conio.h>

void main(){
      int i=0,flag=0;
      char keyw[32][10]={"auto","double","int","struct","break","else","long",
      "switch","case","enum","register","typedef","char",
      "extern","return","union","const","float","short",
      "unsigned","continue","for","signed","void","default",
      "goto","sizeof","voltile","do","if","static","while"},a[10];
      system("cls");
      printf("Enter Identifier a Variable Name: ");
      gets(a);
      for(i=0;i<32;i++)
      {
            if((strcmp(keyw[i],a)==0))
            {
                  flag=1;
            }
      }
      if(flag==1)
      {
            printf("\n%s is Keyword.",a);
      }
      else
      {
            flag=0;

            if((a[0]=='_')||(isalpha(a[0])!=0))
            {
                  for(i=1;a[i]!='\0';i++)
                  {
                        if((isalnum(a[i])==0)&&(a[i]!='_'))
                        {
                              flag=1;
                        }
                  }
            }
            else
            {
                  flag=1;
            }
      }
      if(flag==0)
      {
            printf("\n%s is an Identifier valid variable .",a);
      }
      else
      {
            printf("\n%s is Not an Identifier valid variable .",a);
      }
      getch();
}

