# Student Record Management System

## Project Overview

The **Student Record Management System** is a Java-based console application that helps manage student records efficiently. It allows users to perform various operations, including adding, searching, deleting, and displaying student information. The data can be saved to a **CSV** file and **MySQL database** for persistent storage.

## Features

- **Add Student**: Add a new student record with ID, Name, Age, and Department.
- **Search Student**: Search for a student by their ID.
- **Display Students**: View all student records stored in the system.
- **Delete Student**: Remove a student record by ID.
- **Save Data**: Save student records to a CSV file and MySQL database for persistence.

## Technologies Used

- **Java**: Core programming language used for application logic.
- **MySQL**: Database used for storing student records.
- **File I/O**: CSV file handling for saving and loading data.
- **JDBC**: Java Database Connectivity to interact with the MySQL database.

## Prerequisites

Before running the application, ensure you have the following installed:

- **Java**: JDK 8 or higher
- **MySQL Database**: Installed and running
- **MySQL Connector/J**: For connecting Java with MySQL (Add the JAR to your classpath)

### MySQL Database Setup

1. **Create a Database**:
   ```sql
   CREATE DATABASE student_db;
