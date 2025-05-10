package files;

import java.util.*;

public class StudentManager {

    private Map<Integer, Student> studentMap = new HashMap<>();

    public StudentManager() {
        // Load data from file
        studentMap.putAll(Filehandling.readFromCSV());
    }

    // Add a student
    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
        System.out.println("Student added: " + student);
    }

    // Display all students
    public void displayStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        studentMap.values().forEach(System.out::println);
    }

    // Search a student by ID
    public void searchStudent(int id) {
        Student student = studentMap.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        if (studentMap.remove(id) != null) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Save data to file
    public void saveData() {
        Filehandling.saveToCSV(studentMap);
    }
}
