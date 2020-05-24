#include<iostream>
using namespace std;
int main()
{
  int a,s=0;
  cin>>a;
  do{
    s++;
	a=a/10;
  }while(a);
  cout<<s;
}