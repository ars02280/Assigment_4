 Assignment 4 – SOLID Architecture & Advanced OOP (Java + JDBC)

Project Overview
This project is a console-based Store API built with Java and JDBC.
It demonstrates SOLID principles, layered architecture, and advanced OOP features.

The system manages Products with different types (Game, App) and Categories.
Each Product belongs to exactly one Category.

OOP Design
The core of the domain is an abstract class Product.
It contains common fields (id, name, price, category) and abstract methods.

Subclasses:
Game (adds genre)
 App (adds isPaid flag)

Polymorphism is demonstrated when Products are processed via base Product references.

Composition is used:
Product -> Category
Interfaces and Advanced Features
Implemented interfaces:
Validatable<T> – validation logic
PricedItem – price-related behavior

Interfaces demonstrate abstraction, generics, and default methods.

Lambda expressions are used for sorting and filtering product lists.
Reflection utility prints runtime information about classes.

#Architecture
The project follows a strict layered architecture:
Controller – handles user input
Service – business logic and validation
Repository – JDBC CRUD operations
Database – PostgreSQL

The service layer depends only on interfaces (DIP).

 Database
PostgreSQL database with related tables:
- categories
- products (with foreign key to categories)

Error Handling
Custom exceptions are used:
- InvalidInputException
- DuplicateResourceException
- ResourceNotFoundException
- DatabaseOperationException

Exceptions are thrown in the service layer.

How to Run
1. Create database and tables using schema.sql
2. Add PostgreSQL JDBC driver to classpath
3. Run Main class

Examples of working programm and output:
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/e0bc13eb-b17b-4ec7-aad5-ef7a6ca51f93" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/6e8e3122-9717-4d91-afa4-fd1c13b514ae" />



Reflection & SOLID Demonstration
The application demonstrates:
- Polymorphism
- SOLID principles
- JDBC usage
- Runtime reflection
- Lambdas and generics
