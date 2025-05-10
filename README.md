**Student Record Management System**

**Project Overview**
The Student Record Management System is a Java-based console application that helps manage student records efficiently. It allows users to perform various operations, including adding, searching, deleting, and displaying student information. The data can be saved to a CSV file and MySQL database for persistent storage.

**Features**
Add Student: Add a new student record with ID, Name, Age, and Department.
Search Student: Search for a student by their ID.
Display Students: View all student records stored in the system.
Delete Student: Remove a student record by ID.
Save Data: Save student records to a CSV file and MySQL database for persistence.

**Technologies Used**
Java: Core programming language used for application logic.
MySQL: Database used for storing student records.
File I/O: CSV file handling for saving and loading data.
JDBC: Java Database Connectivity to interact with the MySQL database.

**Prerequisites**
Before running the application, ensure you have the following installed:
Java: JDK 8 or higher
MySQL Database: Installed and running
MySQL Connector/J: For connecting Java with MySQL (Add the JAR to your classpath)
MySQL Database Setup

**Create a Database:**
CREATE DATABASE student_db;

**Create a Students Table:**
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    department VARCHAR(100)
);

JDBC Connection: Update the connection details in your Java code to match your MySQL setup.

**How to Run the Project**
Clone this repository to your local machine.

Set up the MySQL database as described in the MySQL Database Setup section.

Add the MySQL Connector/J JAR file to your project.

Open the Main.java file in your Java IDE or terminal.

Run the Main class to start the application.

**Sample Operations**
Adding a student: Enter the details when prompted.

Displaying all students: View the list of all students in the system.

Searching for a student: Enter the student ID to search.

Deleting a student: Enter the student ID to delete the record.

**Folder Structure**

StudentRecordManagement/
│
├── src/
│   ├── files/
│   │   ├── Student.java
│   │   ├── StudentManager.java
│   │   ├── Filehandling.java
│   │   ├── DB.java
│   │   └── Main.java
│
├── lib/
│   └── mysql-connector-java-<version>.jar  // MySQL JDBC driver
│
└── students.csv  // CSV file storing student data (if applicable)
