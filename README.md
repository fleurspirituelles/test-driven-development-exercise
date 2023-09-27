# Vector Summation Exercise

This repository contains a Java Maven project that implements an exercise involving vector summation. The goal of this exercise is to create two arrays, A and B, each with 5 integer values input by the user. Then, it constructs a third array, C, by summing the corresponding elements of A and B. The result is displayed with elements separated by commas.

## Exercise Description

In this exercise:

1. The program constructs two arrays, A and B, each with 5 integer values.
2. It calculates a third array, C, where each element of C is the sum of the corresponding elements of A and B.
3. The elements of C are displayed, separated by commas.

Any situation outside the defined input domain results in an error output.

## Prerequisites

Before running the project, make sure you have the following installed on your system:

- Java Development Kit (JDK)
- Apache Maven

## Running the Project

Follow these steps to run the project:

1. Clone this repository to your local machine using Git:

   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:

   ```bash
   cd <project-directory>
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the project:

   ```bash
   java -jar target/vector-summation-exercise-1.0-SNAPSHOT.jar
   ```

5. Follow the on-screen prompts to input values for arrays A and B.

6. The program will calculate the sum of vectors A and B and display the result.

## Example

Here's an example of running the program:

```bash
$ java -jar target/vector-summation-exercise-1.0-SNAPSHOT.jar

Please enter 5 integer values for array A, separated by spaces:
2 5 8 34 5

Please enter 5 integer values for array B, separated by spaces:
8 51 2 16 5

The sum of vectors A and B is: 10, 56, 10, 50, 10
```

## Error Handling

The program handles errors for various scenarios, including:

- Null input arrays
- Input arrays with lengths other than 5
- Non-integer inputs

If any of these situations occur, the program will display "Error".
