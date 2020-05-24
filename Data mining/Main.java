#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c=0;
  cin>>a;
  while(a>0){
  	if(a%2==0)
  		b+=a%10;
      else
        c+=a%10;
      a=a/10;
  }
  if(b==c)
    cout<<"Yes";
  else
    cout<<"No";
}