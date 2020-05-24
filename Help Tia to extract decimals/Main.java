#include<iostream>
#include<string>
using namespace std;
int main() 
{
	string fnum;
	getline(cin,fnum);
  if (fnum.find(".")!=string::npos)
 	cout<<"Floating part is : " <<fnum.substr(fnum.find(".")+1);
 	else
  	 cout<<"Floating part is : ";
}