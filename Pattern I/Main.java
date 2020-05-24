#include<iostream>
using namespace std;
int main(){
int n;
std::cin>>n;
  int a=n;
  for(int i=0;i<4;i++){
  	for(int j=0;j<=i;j++)
      {std::cout<<a;}
    cout<<endl;  
    a++;
  }a--;
    for(int i=4;i>0;i--){
  	for(int j=0;j<i;j++){
      std::cout<<a;
  	}
    a--;
    cout<<endl;    
    }
}