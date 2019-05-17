## Project Name
           Command Line Caesar Cipher

## Author
            [Naisenya Mungai](https://github.com/naisenyamungai)
            Student - Full Stack Developer(Java & Android)


## Project Description
> A program that Implement a Caesar cipher, both encoding, and decoding. The key is an integer from 1 to 25.
  This cipher rotates the letters of the alphabet (A to Z). The encoding replaces each letter with the 1st to 25th
  next letter in the alphabet (wrapping Z to A). So key 2 encrypts "HI" to "JK", but key 20 encrypts "HI" to "BC".

## Project Overview

| Behaviour     | Example Input | Example Output  |
 | ------------- | ------------- | ------------- |
 | Program needs to compile and run the code  | User types into the terminal javac App.java && java App | program runs and asks for user input |
 | Program asks the user for a letter and a step value  | "D",5  | encrypts to "I" and decrypts "I" back to "D" |
 | Program needs to compile and run the code for the next test | User types into the terminal javac App.java && java App | program runs and asks for user input |
 | For every character entered, it's position should change with the number of key  | "ABC",6 | Encypts to  "GHI" and decrypts to "ABC"  |
 | Shift key must be in range 1-25  | "B",28  | Returns the value at 28 - 25  |
 | Return nothing when empty string is submitted  | "", 27  | ""  |
 | Encrypt & Decrypts lower and uppercase letters to uppercase | "abcD", 6  | Encrypts to "GHIJ" and decrypts to "ABCD" |
 | Loops through the entire alphabet correctly | "Z",1  and "A", 25 | "A" and "Z" respectively |


## Technologies Used
>The application was created using below technologies;
>- JAVA
>- JUnit


## Known Bugs
> No known Bugs at the moment

## Setup/Installation Requirements

>- Clone this repository
>- Open it on your IDE
>- Compile the App.java file found in the src/main/java folder. If you're using the terminal, navigate to this folder
    and run 'javac App.java'
>- Run the application on the terminal. Run using the command 'java App' and use the application

## Running tests
>- Navigate to any of the files in src/test/java
>- Open the file
>- On the display tab in the IDE, right click the file and run it

## Support and contact details
> naisenyamungai@gmail.com

## To access this my work open below link
> https://github.com/naisenyamungai/CaesarCipherProject/

## [License](https://github.com/naisenyamungai/CaesarCipherProject/LICENSE.md)

MIT © [Naisenya Mungai ](https://github.com/naisenyamungai)
