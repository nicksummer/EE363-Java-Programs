//this program shows that gcc's type checking for C  is not as strict as Java's
// (cf. TypeNotSoFlex.java)

#include <stdio.h>

int main(void) {
  int x = 10;  
  double y = 8.4;

  x = y; //loss of information (fractional part)
  //x = y*2;

  printf("x: %d\n", x);
  printf("y: %f\n", y);

  return 0;  
}

