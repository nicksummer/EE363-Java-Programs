//basic tests in C++; don't have create a class 

#include<iostream>

using std::cout;
using std::endl;

int main(int argc, char *argv[] ) { //arguments to main optional unless need to process cmd-line-args
  cout<<"Hello, world!"<<endl;


  cout<<"num args: "<<argc<<endl;
  cout<<"program name: "<<argv[0]<<endl<<endl;


  if (argc > 1) {
    cout<<"cmd line arguments: "<<endl;
    for (int i = 1; i < argc; i++) {
      cout<<argv[i]<<endl;
    }
  }
  
  return 0;
}

