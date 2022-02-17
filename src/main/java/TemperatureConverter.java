import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Using FlowLayout and Label Output

public class TemperatureConverter {

    public TemperatureConverter() {
        // YOUR CODE HERE!
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Temperature Converter");
        frame.setLayout(new FlowLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JLabel label1 = new JLabel("F");
        frame.add(label1);

        JTextField field1 = new JTextField(14);
        frame.add(field1);

        JButton button1 = new JButton("Convert to C");
        frame.add(button1);

        JLabel label2 = new JLabel("C");
        frame.add(label2);

        JTextField field2 = new JTextField(14);
        frame.add(field2);

        JButton button2 = new JButton("Convert to F");
        frame.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                field2.setText(((Double.parseDouble(field1.getText()) - 32)*5/9) + "");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                field1.setText(((Double.parseDouble(field2.getText())*9/5 + 32)) + "");
            }
        });


        // 4. Size the frame
        frame.setSize(300, 300);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String args[]){
        TemperatureConverter tc = new TemperatureConverter();
    }
}
