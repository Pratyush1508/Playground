#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int a=0,b=n,q,c=n;
  	while(b!=0){     
      ++q;
      b/=10;
    }
  while(n!=0){
    a+=power(n%10,q);
      n/=10;
  } 
  if(a==c)
    return 1;
  else 
   return  0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
}