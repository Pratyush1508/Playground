/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{

int num, i, j = 0;
 cin >> num;
for (i = 1; i <= num; i++)
 {
if ((num % i) == 0)
{

j++;
}
 }
switch(j)
 {
 case 2:
cout<<"Eligible";
break;
default:
cout<<"Not eligible";
 break;
}
}