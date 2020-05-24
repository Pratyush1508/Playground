#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
  string str,str2;
  cin>>str;
  cin>>str2;
  reverse(str.begin(),str.end());
  if(str.compare(str2)==0)
  	 cout<<"It is correct";
  else
     cout<<"It is wrong "<<endl;
}