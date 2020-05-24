#include<iostream>
using namespace std;
int main()
{
  int n,a,flag;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cin>>a;
 for(auto i:arr){
  if(a==i)
    flag=1;
 }
  flag==1?cout<<"She passed her exam":cout<<"She failed";
}