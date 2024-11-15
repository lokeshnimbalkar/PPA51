#include<iostream>
using namespace std;

class Demo
{
    public:
       int No1,No2;

       Demo(int A,int B)
       {
        No1 = A;
        No2 = B;
       }

       void Fun()
       {
        No1++;
        No2++;

       }

       void Gun() const
       {
        No1++;
        No2++;
       }
};

int main()
{

}