import java.awt.*;
import java.awt.event.*;

public class A extends Frame {
    Label l1 = new Label("1st number");
    Label l2 = new Label("2nd number");
    Label l3 = new Label("result");
    TextField tf1 = new TextField();
    TextField tf2 = new TextField();
    TextField tf3 = new TextField();
    Button b1 = new Button("Add");

    A() {
        setLayout(null);
        setVisible(true);
        setSize(800, 600);
        l1.setBounds(100, 250, 120, 30); add(l1);
        tf1.setBounds(300, 250, 120, 30); add(tf1);
        l2.setBounds(100, 300, 120, 30); add(l2);
        tf2.setBounds(300, 300, 120, 30); add(tf2);
        b1.setBounds(300, 350, 120, 30); add(b1);
        l3.setBounds(100, 400, 120, 30); add(l3);
        tf3.setBounds(300, 400, 120, 30); add(tf3);
        setTitle("SCHOLAR's page");
        
        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    String s1 = tf1.getText();
                    String s2 = tf2.getText();

                    int a = Integer.parseInt(s1);
                    int b = Integer.parseInt(s2);
                    int c = a + b;
                    tf3.setText("" + c);
                } catch (NumberFormatException e) {
                    tf3.setText("Invalid input");
                }
            }
        });
    }

    public static void main(String arg[]) {
        new A();
    }
}