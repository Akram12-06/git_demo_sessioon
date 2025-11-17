// Online C++ compiler to run C++ program online
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
    
    map<char,int> mpp;
    
    string str = "akramm";
    
    for(int i=0;i<str.size();i++){
        mpp[str[i]]++;
    }
    
    for(auto i:mpp){
        cout<<i.first<<" "<<i.second<<endl;
    }
    
}