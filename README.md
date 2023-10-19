## Project Description

This is a Java Spring Boot project demonstrating the integration of Spring Boot with Spring Data JPA/Hibernate for data persistence. The H2 database is used as a test database to facilitate development and testing.

**Key Features:**

- **Spring Boot:** We use Spring Boot to create a Java application that is easy to set up and run.
- **Spring Data JPA/Hibernate:** Spring Data JPA is used to simplify access to relational data using the Java Persistence API (JPA) specification and the Hibernate framework.
- **H2 Database:** H2 is a lightweight and fast SQL database, ideal for testing and development.

### How to Use

1. **Clone the Repository:** git clone https://github.com/rafaeldsmp/webservices_spring_boot_jpa.git
The application will be accessible at [http://localhost:8080](http://localhost:8080).

4. **H2 Database Console:**
- **URL:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** (leave it blank)

### Available Endpoints

- Category
   - **Get All Categories:** `GET /categories`
   - **Get Category by ID:** `GET /categories/{id}`
 - Order
     - **Get All Orders:** `GET /orders`
   - **Get Order by ID:** `GET /orders/{id}`
- Product
  - **Get All Products:** `GET /products`
   - **Get Product by ID:** `GET /products/{id}`
- User
   - **Get All users:** `GET /users`
   - **Get User by ID:** `GET /users/{id}`
   - **Create User:** `POST /users`
   - **Request Body JSON:** `{
        "name": "new name",
        "email": "new email",
        "phone": "new phone",
        "password": "new password"
    }`
   - **Update User:** `PUT /users/{id}`
   - **Request Body JSON:** `{
        "name": "new name",
        "email": "new email",
        "phone": "new phone",
        "password": "new password"
    }`
   - **Delete User:** `DELETE /User/{id}`

### Additional Notes

- Make sure you have Java JDK and Maven installed on your system.
- The H2 database is reset every time the application is restarted. Data is not persistent.

## Contributing

Feel free to contribute to this project. If you encounter issues or have suggestions for improvements, open an issue or submit a pull request.
