#include<iostream>
#include<cmath>
using namespace std;

void exp(int m,int n, int req){
if(pow(m,n)>=req)
  cout<<"Doctor, you can proceed with your experiment.";
 else
   cout<<"Sorry Doctor! You need more bacteria.";
}

int main()
{
int m,n,req;
cin>>m>>n>>req;
exp(m,n,req);
}