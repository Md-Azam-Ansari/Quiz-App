# Quiz Application

The Quiz Application is a Spring Boot project that allows users to create quizzes, answer questions, and calculate quiz results. It provides RESTful APIs for managing questions, quizzes, and user responses.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)

## Prerequisites

- Java JDK 
- Spring Boot 
- MySQL or your preferred database
- Maven or Gradle build tool
- IDE (IntelliJ IDEA, Eclipse, etc.)

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/Md-Azam-Ansari/Quiz-App.git
    cd Quiz-App
    ```

2. Configure the database:
   - Create a MySQL database.
   - Update the `application.properties` file with your database configuration.

3. Build and run the application:

    ```bash
    # For Maven
    mvn clean install
    java -jar target/quiz-application.jar

    # For Gradle
    gradlew clean build
    java -jar build/libs/quiz-application.jar
    ```

4. The application should be running at `http://localhost:8080`.

## Project Structure

The project follows a standard Spring Boot application structure:

- `src/main/java/com/sun/quizapp`: Java source code
- `src/main/resources`: Application properties and static resources
- `src/test`: Test source code

## Usage

Provide instructions on how to use the application, create quizzes, answer questions, and view quiz results.

## API Endpoints

- **GET /question/allQuestions**: Get all questions.
- **GET /question/category/{category}**: Get questions by category.
- **POST /question/add**: Add a new question.
- **DELETE /question/delete/{id}**: Delete a question by ID.
- **POST /quiz/create**: Create a new quiz.
- **GET /quiz/get/{id}**: Get quiz questions by ID.
- **POST /quiz/submit/{id}**: Submit a quiz and get the result.
