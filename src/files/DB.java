package files;

import java.sql.*;
import java.util.*;

public class DB {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "sree";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static Map<Integer, Student> loadFromDatabase() {
        Map<Integer, Student> studentMap = new HashMap<>();
        String query = "SELECT * FROM students";
        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String department = rs.getString("department");

                Student student = new Student(id, name, age, department);
                studentMap.put(id, student);
            }
            System.out.println("Data loaded from database.");
        } catch (SQLException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
        return studentMap;
    }

    public static void saveToDatabase(Map<Integer, Student> studentMap) {
        String query = "INSERT INTO students (id, name, age, department) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {

            for (Student student : studentMap.values()) {
                pstmt.setInt(1, student.getId());
                pstmt.setString(2, student.getName());
                pstmt.setInt(3, student.getAge());
                pstmt.setString(4, student.getDepartment());
                pstmt.executeUpdate();
            }
            System.out.println("Data saved to database.");
        } catch (SQLException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
