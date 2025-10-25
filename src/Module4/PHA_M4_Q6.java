package Module4;

import java.awt.*;
import java.awt.event.*;

public class PHA_M4_Q6 extends Frame implements ActionListener {

    // Components
    Label nameLabel, rollLabel, courseLabel;
    TextField nameField, rollField, courseField;
    Button submitButton;

    // Constructor
    public PHA_M4_Q6() {
        // Frame setup
        setTitle("Student Registration Form");
        setSize(1000, 200);
        setLayout(new FlowLayout());

        // Create Labels
        nameLabel = new Label("Name:");
        rollLabel = new Label("Roll No:");
        courseLabel = new Label("Course:");

        // Create TextFields
        nameField = new TextField(20);
        rollField = new TextField(20);
        courseField = new TextField(20);

        // Create Button
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        // Add components to frame
        add(nameLabel);
        add(nameField);
        add(rollLabel);
        add(rollField);
        add(courseLabel);
        add(courseField);
        add(submitButton);

        // Window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String roll = rollField.getText();
            String course = courseField.getText();

            // Display in dialog box
            Dialog d = new Dialog(this, "Student Details", true);
            d.setLayout(new FlowLayout());
            Label details = new Label("Name: " + name + ", Roll No: " + roll + ", Course: " + course);
            Button ok = new Button("OK");
            ok.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    d.setVisible(false);
                }
            });

            d.add(details);
            d.add(ok);
            d.setSize(350, 150);
            d.setVisible(true);

            // Optional: Print to console
            System.out.println("Student Details Submitted:");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + roll);
            System.out.println("Course: " + course);
        }
    }

    // Main method
    public static void main(String[] args) {
        new PHA_M4_Q6();
    }
}
