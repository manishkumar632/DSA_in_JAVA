// Write a program that uses if statements to check if a number is positive, negative, or zero. Then, use a for loop to print the numbers from 1 to 10.

#include <iostream>
int main()
{
    int number;
    std::cout << "Enter a number: ";
    std::cin >> number;
    if (number > 0)
    {
        std::cout << number << " is positive.\n";
    }
    else if (number < 0)
    {
        std::cout << number << " is negative.\n";
    }
    else
    {
        std::cout << number << " is zero.\n";
    }
    for (int i = 1; i <= 10; i++)
    {
        std::cout << i << "\n";
    }
}