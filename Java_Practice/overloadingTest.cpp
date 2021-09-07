//basic function overloading tests
//shows type conversions; compiler chooses the best function
//sometimes can't determine a single best one (causes an error)

#include<iostream>

using std::cout;
using std::endl;

void foo() {
  cout<<"{{{In foo()}}}"<<endl;
}

void foo(int a) {
  cout<<"{{{In foo(int)}}}"<<endl;
}

void foo(double a) {
  cout<<"{{{In foo(double)}}}"<<endl;
}

void foo(double a, int b) {
  cout<<"{{{In foo(double, int)}}}"<<endl;
}


void foo(int a, double b) {
  cout<<"{{{In foo(int, double)}}}"<<endl;
}

void foo(double a, double b) {
  cout<<"{{{In foo(double, double)}}}"<<endl;
}



//TRY
//here, the return is type different
// double foo(int a, double b) {
//   cout<<"In foo(int, double)"<<endl;
// }


int main(void) {

  int x = 4000;
  float y = 3.4;
  double z = 30.0;
  short s = 1;


  cout<<"Calling foo():\t";
  foo();

  cout<<"Calling foo(x), where x is an int:\t";
  foo(x);

  cout<<"Calling foo(z, 4), where z is a double:\t";
  foo(z, 4);


  //widening
  cout<<"Calling foo(y), where y is a float:\t";
  foo(y);

  //widening
  cout<<"Calling foo(x, y), where x is an int, y is a float:\t";
  foo(x, y);

  //widening
  cout<<"Calling foo(y, x), where y is float, x is int: \t";
  foo(y, x);


  //widening
  cout<<"Calling foo(s), where s is a short: \t";
  foo(s);

  // //TRY: unable to disambiguate
  // cout<<"Calling foo(x, x) where x is an int: \t";
  // foo(x, x);

  return 0;
}
