#include <bits/stdc++.h>
using namespace std;

typedef struct Student{
    string dept;
    string name; 
    int year;
    float cgpa;
}data;

bool compare(data a, data b)
{
	//for descending order replace with a.roll >b.roll
	if(a.name < b.name)		
		return 1;
	else
		return 0;
}

int main()
{
    int n,i=0;
    cout<<"Enter the number of students"<<endl;
    cin>>n;
    data s[n];
    while(i<n){
        cout<<"Enter the details of student "<<i+1<<endl;
        cout<<"Enter name"<<endl;
        cin>>s[i].name;
        
        cout<<"Enter department"<<endl;
        cin>>s[i].dept;
        
        cout<<"Enter year of study"<<endl;
        cin>>s[i].year;
        
        cout<<"Enter cgpa"<<endl;
        cin>>s[i].cgpa;
        
        i++;
    }
    sort(s,s+n,compare);
    
    cout<<"Details of students"<<endl;
    i=0;
    while(i<n){
        cout<<"Student "<<i+1<<endl;
        cout<<"Name:"<<s[i].name<<endl;
        cout<<"Department:"<<s[i].dept<<endl;
        cout<<"Year of study:"<<s[i].year<<endl;
        cout<<"CGPA:"<<setprecision(2)<<s[i].cgpa<<endl;
        i++;
    }
    return 0;
}
