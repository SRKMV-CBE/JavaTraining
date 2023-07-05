#include<stdio.h>
#include<conio.h>
int main()
{
  char ch;
  int num;
  clrscr();
  printf("\n Enter The Character :");
  scanf("%c",&ch);
  printf("\n The ASCII Value Is :%d",ch);

  printf("\n Enter The Number :");
  scanf("%d",&num);
  printf("\n The ASCII Value Is :%c",num);

  getch();
  return 0;
}
