#include<iostream>
using namespace std;

int main(){
	int n,m;
   float a=0.5;
  cin>>n;
  cout<<a<<" ";
  for(int i=2;i<=n;i++)
  {
    a*=3;
    cout<<a<<" ";
  }
}