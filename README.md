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
 | User types in a single letter and a key(number)   | "D",5  | "I"  |
 | For every character entered, it's position should change with the number of key  | "ABC",1  | "BCD"  |
 | Each character in a sentence should shift forward by the number of the shift key  | "I am happy",2  | "K co jcrra"  |
 | Shift key must be in range 1-25  | "A",50  | Asks for input again  |
 | Return nothing when empty string is submitted  | "",2  | ""  |
 | Encrypt lower and uppercase letters appropriately  | "A caT",1  | "B dbU"  |
 | Ensure looping through the alphabet shift  | "Z",1  | "A"  |


## Technologies Used
>The application was created using below technologies;
>- JAVA
>- JUnit


## Known Bugs
> No known Bugs at the moment

## Setup/Installation Requirements

>- Clone this repository
>- Open it on your IDE
>- Compile the App.java file found in the src/main/java folder. If you're using the terminal, navigate to this folder and run 'javac App.java'
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
