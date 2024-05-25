// Write a program that contains a function called isEven() which takes an integer as input and returns true if the number is even and false otherwise. Use this function to determine whether a number entered by the user is even or odd.

#include <iostream>
bool isEven(int number)
{
    if (number % 2 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{
    int number;
    std::cout << "Enter a number: ";
    std::cin >> number;
    if (isEven(number))
    {
        std::cout << number << " is even.";
    }
    else
    {
        std::cout << number << " is odd.";
    }
    return 0;
}