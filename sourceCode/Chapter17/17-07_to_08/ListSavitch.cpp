//DISPLAY 17.5 Program Using the GenericList Class Template
//Program to demonstrate use of the class template GenericList.
#include <iostream>
#include "genericlist.h"
//#include "genericlist.cpp"


using namespace std;
using namespace listsavitch;


//not helping
// namespace listsavitch {
//   template<class ItemType>
//   ostream& operator<<(ostream& outs, const GenericList<ItemType>& theList);
// }


int main( )
{
    GenericList<int> firstList(2);
    firstList.add(1);
    firstList.add(2);


    //line below is causing compile issue
    // cout << "firstList = \n"<< firstList;

    // GenericList<char> secondList(10);
    // secondList.add('A');
    // secondList.add('B');
    // secondList.add('C');
    // cout << "secondList = \n"
    //      << secondList;

    return 0;
}


