#include<iostream>
using namespace std;
int main()
{
  int birth,current;
  cin>>birth>>current;
  if(current<birth)
  {
    birth=100-birth;
    cout<<(birth+current);
  }
  else
  cout<<current-birth;
}