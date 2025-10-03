# HTMX Example Project

This project demonstrates a simple Spring Boot application integrated with HTMX for building dynamic and interactive web applications. The application allows users to manage a list of todos with features like adding and deleting items dynamically.

## Features

- **Add Todos**: Users can add new todos dynamically using HTMX.
- **Delete Todos**: Users can delete existing todos with confirmation prompts.
- **Dynamic Updates**: The todo list updates dynamically without requiring a full page reload.

## Technologies Used

- **Spring Boot**: Backend framework for building the application.
- **HTMX**: Frontend library for dynamic interactions.
- **Thymeleaf**: Template engine for rendering HTML views.

## Project Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── dev.naimsulejmani.pts
│   │   │       ├── PtsApplication.java
│   │   │       ├── Todo.java
│   │   │       ├── TodoController.java
│   │   │       └── Todos.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   │           └── todos.html
│   └── test
│       └── java
│           └── dev.naimsulejmani.pts
│               └── PtsApplicationTests.java
```

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd htmx-example
   ```

2. **Build the Project**:
   ```bash
   ./mvnw clean install
   ```

3. **Run the Application**:
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the Application**:
   Open your browser and navigate to `http://localhost:8080`.

## Endpoints

- `GET /`: Displays the list of todos.
- `POST /`: Adds a new todo.
- `DELETE /{todoId}`: Deletes a todo by its ID.

## Dependencies

- Java 17 or higher
- Maven

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments

- [HTMX Documentation](https://htmx.org/docs/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)
