#include<iostream>
using namespace std;
int main()
{
  int n,high=0,a;
  cin>>n;
  //int a[n];
  for(int i=0;i<n;i++)
  { cin>>a;
    high=high>a?high:a;
  }
   cout<<high;
  
}