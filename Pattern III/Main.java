#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
    int n;
    cin>>n;
    int i,j,k;
  	for(i=1;i<=n;i++)
    {  for(j=1;j<=i;j++){
        cout<<i;
      if(j<i)
        cout<<"*";}
      cout<<"\n";
    }
  for(i=n;i>0;i--)
    {  for(j=1;j<=i;j++)
    {cout<<i;
    if(j<i)
      cout<<"*";}
      cout<<"\n";
    } 
}