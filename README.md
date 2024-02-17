# WishList Management API

WishList Management API is a Java application built using Maven and the Spring Boot framework. It incorporates Spring Security for JWT authentication to manage wishlist-related operations securely.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- Spring Boot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.
- Spring Security: A framework that provides comprehensive security services for Java EE-based enterprise software applications.

## Dataflow

### Entities

I have a `User` entity in my project with properties such as `id`, `firstName`, `lastName`, `email`, `password`, etc. Also I have wishlist entity which container intem name and description and many to one mapping with user.Additionally, I have utilized JWT authentication for secure access to wishlist-related endpoints.

### Controllers

I have implemented controllers for user and wishlist operations. The provided APIs include:
1. `POST /api/v1//user/signUp`: To register a new user.
2. `POST /api/v1//user/login`: To authenticate a user and generate a JWT token.
3. `POST /api/v1//wishlist/item`: To add wishlist item for a user.
4. `DELETE /api/v1//wishlist/item`: To delete wishlist item by id.
5. `GET /api/v1//wishlist/user`: To retrieve all wishlist items of user.


### Services

The services layer contains business logic for wishlist and customer related operations. It acts as an intermediary between the controllers and the repository, encapsulating complex functionalities.

### Repository

The repository layer is responsible for data access and manipulation. It communicates with the database and performs CRUD (Create, Read, Update, Delete) operations on the User and Wishlist entity.

## Data Structure

I have utilized MySQL as the database to store user and wishlist data persistently.

## Project Summary

TheWishList Management API is an authenticated system where users can register, log in, and perform various operations on their wishlist securely like add wishlist , get all wishlist and delete wish list. JWT authentication is employed to ensure secure access to wishlist endpoints. The application provides functionality for registering users, logging in.
