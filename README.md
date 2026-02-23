# Exception Control

Educational Java project to practice throwing and testing exceptions with **JUnit 5**.

## Objective

- Understand how to throw and catch exceptions in Java
- Throw `ArrayIndexOutOfBoundsException` intentionally
- Write JUnit 5 tests to verify that the exception is thrown under specific conditions
- Learn good practices for exception testing (`assertThrows`)

## Statement Summary

1. Create a Java class with a public method that **throws** `ArrayIndexOutOfBoundsException`  
   (e.g., accessing a non-existent array index)

2. Implement a JUnit 5 test class that:
    - Calls the method with invalid input
    - Verifies that `ArrayIndexOutOfBoundsException` is thrown
    - Optionally checks the exception message or cause

## Project Structure (Maven/Gradle example)

```text
exceptionControl/
├── pom.xml (or build.gradle)
└── src/
├── main/java/
│   └── ArrayAccessService.java
└── test/java/
└── ArrayAccessServiceTest.java
```

## How to Run Tests

```bash
# Maven
mvn test
# Gradle
gradle test
```

### Example Code Snippet (Test)

```Java
@Test
void shouldThrowArrayIndexOutOfBoundsWhenIndexIsInvalid() {
    ArrayAccessService service = new ArrayAccessService();

    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        service.getElementAt(10); // invalid index
    });
}
```