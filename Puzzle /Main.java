#include <iostream>
#include <iterator>
#include <algorithm>
using namespace std;

int main(){
    int row,col,temp;
    cin>>row>>col;
    int a[row][col],b[col][row];
    for(int i=0; i<row; i++)
        for(int j=0; j<col; j++)
            cin>>a[i][j];

    for(int i=0; i<row; i++)
        for(int j=0; j<col; j++)
            b[j][i]=a[i][j];
 
    for(int i=0; i<col; i++){
        for(int j=0; j<row; j++)
            cout<<b[i][j]<<" ";
        cout<<endl;}
}