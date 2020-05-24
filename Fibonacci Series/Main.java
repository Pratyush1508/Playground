#include<iostream>
using namespace std;

long fibonnaci(int num){
        if(num <= 0){
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        return fibonnaci(num-1) + fibonnaci(num-2);
    }
int main() {
    int n;
    cin>>n;
   cout<<"The term "<<n<<" in the fibonacci series is "<<fibonnaci(n-1);
    return 0;
}
