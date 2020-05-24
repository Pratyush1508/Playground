#include<iostream>
using namespace std;
int main()
{
int a,s=0,d;
cin>>a;
  d=a;
  while(d>0){
  	s=s+d%10;
    d=d/10;
  }
  
  if(a%s==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}