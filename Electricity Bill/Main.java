#include<iostream>
using namespace std;
int main()
{
  int unit,a;
  cin>>unit;
  if(unit<=200)
    a=unit*0.5;
  else if(unit<=400)
  	a=unit*.65+100;
  else if(unit<=600)
  	a=unit*.8+200;
  else
  	a=unit*1.25+425;
  cout<<"Rs."<<a;
}