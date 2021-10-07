//DISPLAY 16.5 Throwing an Exception Inside a Function
#include <iostream>
#include <cstdlib>
using namespace std;

class DivideByZero
{};


//deprecated: throw(DivideByZero); 
double safeDivide(int top, int bottom); 

int main()
{
    int numerator;
    int denominator;
    double quotient;
    cout << "Enter numerator:\n";
    cin >> numerator;
    cout << "Enter denominator:\n";
    cin >> denominator;

    // int quotient2 = safeDivide(numerator, denominator);
    // cout<<"quotient: "<<quotient2<<endl;

    try
    {
       quotient = safeDivide(numerator, denominator);
    }
    catch(DivideByZero)
    {
         cout << "Error: Division by zero!\n"
              << "Program aborting.\n";
         exit(0);
    }

    cout << numerator << "/" << denominator
         << " = " << quotient << endl;

    cout << "End of program.\n";
    return 0;
}


double safeDivide(int top, int bottom)  
{
    if (bottom == 0)
        throw DivideByZero();

    return top/static_cast<double>(bottom);
}

