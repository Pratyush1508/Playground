#include<iostream>
using namespace std;
int main()
{
 int n,a=2,d=6,s=0;
 std::cin>>n;
 if(n>=1)
   std::cout<<0<<" ";
if(n>=2)
   std::cout<<2<<" ";
 for(int i=3;i<=n;i++){
  s++;
  a=a+d;
  std::cout<<a<<" ";
  if(s==2){
    d+=4;
    s=0;}
  } 
}
  