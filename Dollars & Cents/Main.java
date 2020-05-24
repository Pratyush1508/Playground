#include<iostream>
using namespace std;
int main()
{
  int a,s,d,f,doll,cent;
  cin>>a>>s>>d>>f;
  cent=(s+f)%100;
  doll=a+d+(s+f)/100;
  cout<<doll<<endl;
  cout<<cent;
}