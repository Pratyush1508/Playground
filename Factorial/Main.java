#include<iostream>
using namespace std;
int fact(int a)
{
	int f=1;
  for(int i=1;i<=a;i++)
    f*=i;
  return f;

}

int main()
{
  int a;
  cin>>a;
  cout<<"The factorial of "<<a<<" is "<<fact(a);
}