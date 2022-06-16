import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
//window that shows food types 
public class Menu_GUI {

    JFrame frame;

    /**
     * Launch the application.
     */
    double price = 0;
    String item = "";
    Queue < String > Orders = new PriorityQueue < > ();
    Queue < Double > Tab = new PriorityQueue < > ();
    Table table = new Table(Orders, Tab);

    private GUI instance;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu_GUI window = new Menu_GUI();
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
    public Menu_GUI(Table table) {
        this.table = table;
        initialize();
    }
    public Menu_GUI() {
        this.table = table;
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

        JButton btnNewButton = new JButton("Burgers");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {



                Bugers window = new Bugers(table);
                window.frame.setVisible(true);

                frame.setVisible(false);




            }
        });
        btnNewButton.setBounds(10, 34, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Wings");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


                Wings_Menu window = new Wings_Menu(table);
                window.frame.setVisible(true);

                frame.setVisible(false);




            }
        });
        btnNewButton_1.setBounds(10, 78, 89, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Soups");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


                Soup_Menu window = new Soup_Menu(table);
                window.frame.setVisible(true);

                frame.setVisible(false);

            }
        });
        btnNewButton_2.setBounds(10, 121, 89, 23);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Salads");
        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Salads_Menu window = new Salads_Menu(table);
                window.frame.setVisible(true);

                frame.setVisible(false);

            }
        });
        btnNewButton_3.setBounds(10, 155, 89, 23);
        frame.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Sides");
        btnNewButton_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Sides window = new Sides(table);
                window.frame.setVisible(true);

                frame.setVisible(false);

            }
        });
        btnNewButton_4.setBounds(10, 189, 89, 23);
        frame.getContentPane().add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Back");
        btnNewButton_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


                Table_GUI window2 = new Table_GUI();
                window2.frame2.setVisible(true);


                frame.setVisible(false);




            }
        });
        btnNewButton_5.setBounds(335, 227, 89, 23);
        frame.getContentPane().add(btnNewButton_5);




    }
    //Instance handler 
    public void set_instance(GUI instance) {

        this.instance = instance;



    }

}