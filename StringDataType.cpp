#include <iostream>
#include <string>

int main() {
  // Declaration and initialization
  std::string str1 = "Hello";
  std::string str2;

  // Copying strings
  str2 = str1;
  std::cout << "str2: " << str2 << std::endl;

  // Concatenating strings
  str2 += " World";
  std::cout << "str2 after concatenation: " << str2 << std::endl;

  // Finding the length of a string
  std::cout << "Length of str2: " << str2.length() << std::endl;

  // Accessing characters in a string
  std::cout << "First character of str2: " << str2[0] << std::endl;

  // Substring
  std::string sub = str2.substr(0, 5);
  std::cout << "Substring of str2: " << sub << std::endl;

  // Finding a substring
  size_t pos = str2.find("World");
  if (pos != std::string::npos) {
    std::cout << "\"World\" found at position: " << pos << std::endl;
  } else {
    std::cout << "\"World\" not found" << std::endl;
  }

  // Replacing part of a string
  str2.replace(6, 5, "Universe");
  std::cout << "str2 after replacement: " << str2 << std::endl;

  return 0;
}
