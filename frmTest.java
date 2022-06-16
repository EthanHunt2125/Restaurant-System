import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
//Login in Window
public class frmTest {

    JFrame frame;
    private JPasswordField passwordField;
    private JTextField textField;
    Employee user = new Employee();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmTest window = new frmTest();

                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    /**
     * Create the application.
     */
    public frmTest() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        passwordField = new JPasswordField();

        passwordField.setBounds(134, 127, 127, 20);
        frame.getContentPane().add(passwordField);
        JLabel lblNewLabel_2 = new JLabel("");

        lblNewLabel_2.setBounds(274, 106, 134, 14);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton = new JButton("Enter");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e2) {

                char[] user_password = passwordField.getPassword();
                String user_name = textField.getText();
                String str = new String(user_password);

                user.set_username(user_name);
                user.set_password(str);
                //login method of Employee class call
                try {
                    user.employee_login(user);
                } catch (FileNotFoundException e3) {
                    // TODO Auto-generated catch block
                    e3.printStackTrace();
                }



                if (user.is_logged_in == true) {
                    GUI window = null;
                    try {
                        System.out.println(user.ID);
                        System.out.println(user.username);
                        window = new GUI(user);
                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    window.frame.setVisible(true);
                    frmTest.this.frame.setVisible(false);
                }

                if (user.is_logged_in == false) {


                    lblNewLabel_2.setForeground(Color.RED);
                    lblNewLabel_2.setBackground(Color.RED);
                    lblNewLabel_2.setText("Incorrect Information Try again ");
                }







            }
        });
        btnNewButton.setBounds(134, 158, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JLabel lblNewLabel = new JLabel("Password");
        lblNewLabel.setBounds(135, 106, 103, 20);
        frame.getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(134, 75, 127, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Username");
        lblNewLabel_1.setBounds(134, 50, 127, 14);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel("J's Restaurant");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 27));
        lblNewLabel_3.setBounds(55, 6, 282, 33);
        frame.getContentPane().add(lblNewLabel_3);



    }
}