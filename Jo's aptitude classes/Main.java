#include <iostream>

using namespace std;

int gcd(int n1,int n2){
	if(n1==0 || n2 == 0)
      return 0;
  	else if(n1==n2) return n1;
  	else if(n1>n2)
         return gcd(n1-n2,n1);
    else
         return gcd(n2-n1,n1);
}

int main(){
	int a,b,c,d;
	cin>>a>>b>>c>>d;
	int d1=gcd(a,gcd(b,c));
	if(d==d1)
      cout<<"Answer is correct.";
    else
      cout<<"Answer is wrong.";
}