#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str,str1;
  cin>>str;
  for(int i=0;i<str.length();i++)
    if((int(str.at(i))>64 && int(str.at(i))<91)||(int(str.at(i))>96 && int(str.at(i))<123))
  		str1+=str.at(i);
cout<<str1;
}