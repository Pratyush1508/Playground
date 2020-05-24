#include<iostream>
using namespace std;
int main()
{
int Enum,Tnum,sum=0;
cin>>Enum>>Tnum;
int n=Enum+Tnum;
for(int i=1;i<=n/2;i++){
if(n%i==0)
sum=sum+i;}
if(sum==n)
cout<<"They can read the message";
else
cout<<"They can't read the message";
}