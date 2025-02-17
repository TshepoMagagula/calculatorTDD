## Java JUnit TDD Project

### Description

This project demonstrates Test-Driven Development (TDD) using Java and JUnit. It includes implementations of basic mathematical operations (addition and multiplication) with test cases written first to ensure correctness before implementation.

### Features

Addition Function: Supports multiple integers.

Multiplication Function: Supports multiple integers.

JUnit Test Cases: Ensures the correctness of the implemented functions.

### Technologies Used

Java

JUnit 5

### Setup Instructions

Clone the repository:

```bash
git clone <repository-url>
```
Navigate to the project directory:
```bash
cd java-junit-tdd
```

Compile the project:
```bash
javac -cp .:junit-platform-console-standalone-1.8.2.jar *.java
````

Run tests:
```bash
java -jar junit-platform-console-standalone-1.8.2.jar --class-path . --select-class MathOperationsTest
```

### Usage

Call the methods in Add, AddMultiple, Multiply, and MultiplyMultiple classes:
```bash
int sum = AddMultiple.addMultiple(1, 2, 3, 4, 5); // Returns 15
int product = MultiplyMultiple.multiply(1, 2, 3, 4, 5); // Returns 120
```

### ScreenShots

Pass Tests:
![AddMultipleTest(Pass)](https://github.com/user-attachments/assets/ac39669a-7617-406c-9395-b63d7d613f67)
![MultiplyMultiple(Pass)](https://github.com/user-attachments/assets/f87f3ea0-8c24-40b7-ad4d-70b26d020fed)

Fail Tests:
![AddMultipleTest(F)](https://github.com/user-attachments/assets/230666ad-3dc3-4ad1-b8a5-7c5401e2f017)
![MultiplyMultiple(Fail)](https://github.com/user-attachments/assets/fc022bf1-4f55-430c-a8de-e36b2566422d)
### Contribution

Feel free to fork the repository and submit pull requests for improvements or new features.

### License

This project is licensed under the MIT License.

