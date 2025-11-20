package Module6;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/company_db";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    // Insert employee
    public static void insertEmployee(int id, String name, String dept, double salary) throws Exception {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        String query = "INSERT INTO employees(emp_id, name, department, salary) VALUES(?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, dept);
        pst.setDouble(4, salary);

        pst.executeUpdate();

        pst.close();
        con.close();
    }

    // Fetch all employees
    public static ArrayList<Object[]> getAllEmployees() throws Exception {
        ArrayList<Object[]> data = new ArrayList<>();

        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        String query = "SELECT * FROM employees";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            Object[] row = new Object[4];
            row[0] = rs.getInt("emp_id");
            row[1] = rs.getString("name");
            row[2] = rs.getString("department");
            row[3] = rs.getDouble("salary");
            data.add(row);
        }

        rs.close();
        st.close();
        con.close();

        return data;
    }
}

