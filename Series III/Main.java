#include<iostream>
using namespace std;
int main(){
int n,a=6;
  std::cin>>n;
  for(int i=0;i<n;i++){
 	std::cout<<a<<" ";
	a=a+5*(i+1);
  }
}