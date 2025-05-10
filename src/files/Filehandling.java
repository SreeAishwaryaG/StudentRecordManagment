package files;

import java.io.*;
import java.util.*;

public class Filehandling {

    private static final String FILE_NAME = "students.csv";

    public static void saveToCSV(Map<Integer, Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write("ID,Name,Age,Department\n");
            for (Student s : students.values()) {
                writer.write(s.toCSV() + "\n");
            }
            System.out.println(" Data saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println(" Error saving file: " + e.getMessage());
        }
    }

    public static Map<Integer, Student> readFromCSV() {
        Map<Integer, Student> students = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            reader.readLine(); // skip header
            while ((line = reader.readLine()) != null) {
                Student student = Student.fromCSV(line);
                students.put(student.getId(), student);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
        return students;
    }
}
