#include<iostream>
using namespace std;
string removeWord(string str, string word)  
{ 
    // Check if the word is present in string 
    // If found, remove it using removeAll() 
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
  
        // To cover the case 
        // if the word is at the 
        // beginning of the string 
        // or anywhere in the middle 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
  
        // To cover the edge case 
        // if the word is at the 
        // end of the string 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
  
    // Return the resultant string 
    return str; 
} 
int main()
{
	string str,word="the",str1;
  	getline(cin,str);
  	str1=removeWord(str,word);
  cout<<str1;
}