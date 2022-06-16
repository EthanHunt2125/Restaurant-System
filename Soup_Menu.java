import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;
//window of food type uses stander functions
public class Soup_Menu {

    JFrame frame;
    double price = 0;
    String item = "";
    Queue < String > Orders = new PriorityQueue < > ();
    Queue < Double > Tab = new PriorityQueue < > ();
    Table table2 = new Table(Orders, Tab);
    JFrame instance;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Soup_Menu window = new Soup_Menu();
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
    public Soup_Menu() {
        initialize();
    }

    public Soup_Menu(Table table) {
        this.table2 = table;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addMouseListener(new MouseAdapter() {


            @Override
            public void mouseClicked(MouseEvent e) {
                Menu_GUI window2 = new Menu_GUI();
                window2.frame.setVisible(true);


                frame.setVisible(false);


            }
        });
        frame.getContentPane().setLayout(null);
        btnNewButton.setBounds(10, 11, 137, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Chicken Soup");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                table2.additem(" Chicken soup ", 5.25);

                Table_GUI window2 = new Table_GUI(table2);
                window2.frame2.setVisible(true);


                frame.setVisible(false);


            }
        });

        btnNewButton_1.setBounds(10, 57, 137, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Mushroom Soup");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                table2.additem(" Mushroom soup ", 5.25);

                Table_GUI window2 = new Table_GUI(table2);
                window2.frame2.setVisible(true);


                frame.setVisible(false);



            }
        });
        btnNewButton_2.setBounds(10, 91, 137, 23);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Mysterious Soup");
        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


                table2.additem(" Mysterious soup ", 5.25);

                Table_GUI window2 = new Table_GUI(table2);
                window2.frame2.setVisible(true);


                frame.setVisible(false);


            }
        });

        btnNewButton_3.setBounds(10, 125, 142, 23);
        frame.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("French Onion");
        btnNewButton_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                table2.additem(" French onion soup ", 5.25);

                Table_GUI window2 = new Table_GUI(table2);
                window2.frame2.setVisible(true);


                frame.setVisible(false);

            }
        });
        btnNewButton_4.setBounds(10, 172, 137, 23);
        frame.getContentPane().add(btnNewButton_4);



    }
    public void set_instance(JFrame instance) {

        this.instance = instance;



    }

}