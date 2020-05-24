#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c],b[r][c];
  int i, j;
  for (i = 0; i < r; i++)
    for (j = 0; j < c; j++)
      cin>>a[i][j];
  
  for (i = 0; i < r; i++)
    for (j = 0; j < c; j++)
      cin>>b[i][j];
  
  for (i = 0; i < r; i++){
    for (j = 0; j < c; j++){
      std::cout<<a[i][j]+b[i][j]<<" ";
    }
    std::cout<<"\n";
  }
  return 0;
}