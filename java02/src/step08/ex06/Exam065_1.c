#include <stdio.h>

int plus(int a, int b) {
  return a + b;
}

int plusTri(int a, int b, int c) {
  return a + b + c;
}

int main() {
  printf("Hello, world!\n");
  
  int sum = plus(10, 20);
  printf("result: %d\n", sum);
  
  sum = plusTri(10, 20, 30);
  printf("result: %d\n", sum);
  
  return 0;
}









