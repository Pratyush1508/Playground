#include<iostream>
using namespace std;
int main()
{
  int q,w,e,r,t,y,u,i,o,f,a,s;
  cin>>q>>w>>e>>r>>t>>y>>u>>i>>o;
  f=q*(100-w)/100+e;
  cout<<"In Flipkart Rs."<<f<<endl;
  s=r*(100-t)/100 +y;
  cout<<"In Snapdeal Rs."<<s<<endl;
  a=u*(100-i)/100+o;
  cout<<"In Amazon Rs."<<a<<endl;
  if(f<=s && f<=a)
    cout<<"He will prefer Flipkart";
  else if(s<f && s<a)
         cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}