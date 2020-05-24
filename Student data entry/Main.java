#include <iostream>
#include <string>
using namespace std;
struct student
{
   string name;
   int roll;
   float marks;
};
int main() 
{
   student s1;
   getline(cin,s1.name);
     cin>>s1.roll;
	cin>>s1.marks;
  cout<<endl<<"Student Details"<<endl;
  cout<<"Name: "<<s1.name<<endl;
  cout<<"Roll: "<<s1.roll<<endl;
  cout<<"Marks: "<<s1.marks;
}