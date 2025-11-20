package Module6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class EmployeeForm extends JFrame {

    private JTextField idField, nameField, deptField, salaryField;
    private JTable table;
    private DefaultTableModel tableModel;

    public EmployeeForm() {
        setTitle("Employee Management System");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ======= FORM =======
        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));

        form.add(new JLabel("Employee ID:"));
        idField = new JTextField();
        form.add(idField);

        form.add(new JLabel("Name:"));
        nameField = new JTextField();
        form.add(nameField);

        form.add(new JLabel("Department:"));
        deptField = new JTextField();
        form.add(deptField);

        form.add(new JLabel("Salary:"));
        salaryField = new JTextField();
        form.add(salaryField);

        JButton addBtn = new JButton("Add Employee");
        JButton viewBtn = new JButton("View All Employees");

        form.add(addBtn);
        form.add(viewBtn);

        add(form, BorderLayout.NORTH);

        // ======= TABLE =======
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Department", "Salary"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // ======= BUTTON ACTIONS =======
        addBtn.addActionListener(e -> addEmployee());
        viewBtn.addActionListener(e -> loadEmployees());
    }

    private void addEmployee() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String dept = deptField.getText();
            double salary = Double.parseDouble(salaryField.getText());

            EmployeeDAO.insertEmployee(id, name, dept, salary);
            JOptionPane.showMessageDialog(this, "Employee added!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void loadEmployees() {
        try {
            ArrayList<Object[]> employees = EmployeeDAO.getAllEmployees();
            tableModel.setRowCount(0);

            for (Object[] row : employees) {
                tableModel.addRow(row);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeForm().setVisible(true));
    }
}
