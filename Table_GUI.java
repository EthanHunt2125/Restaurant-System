import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
//window of specific table
public class Table_GUI {
    Queue < String > Orders = new PriorityQueue < > ();
    Queue < Double > Tab = new PriorityQueue < > ();
    Employee user;
    JFrame instance = new JFrame();
    JFrame frame2;
    Table table = new Table(Orders, Tab);

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Table_GUI window = new Table_GUI();
                    window.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Table_GUI(Table table) {
        this.table = table;
        initialize();

    }

    public Table_GUI() {
        initialize();

    }
    public Table_GUI(Employee user) {
        this.table.User = user;
        initialize();

    }


    public Table_GUI(Queue < String > orders2) {
        this.table.Orders = orders2;
        initialize();

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame2 = new JFrame();
        frame2.setBounds(100, 100, 450, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.getContentPane().setLayout(null);
        JLabel lblNewLabel_2 = new JLabel("");

        lblNewLabel_2.setBounds(274, 106, 134, 14);
        frame2.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton = new JButton("Add Item to Tab");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Menu_GUI window = new Menu_GUI(table);
                window.frame.setVisible(true);
                //window.table2.set_Tab(Orders, Tab);

                frame2.setVisible(false);

            }
        });
        btnNewButton.setBounds(10, 11, 141, 23);
        frame2.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Remove Last Item");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                table.Orders.poll();
                lblNewLabel_2.setText("Removed Item");
            }
        });
        btnNewButton_1.setBounds(10, 45, 141, 23);
        frame2.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("View Table Tab");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.print(table.Orders);
                lblNewLabel_2.setText("Printed to Console");


            }
        });




        btnNewButton_2.setBounds(10, 78, 141, 23);
        frame2.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Back");
        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                GUI window2 = null;
                try {
                    window2 = new GUI(table.Orders, table.User);
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

                window2.frame.setVisible(true);


                frame2.setVisible(false);



            }
        });
        btnNewButton_3.setBounds(10, 227, 141, 23);
        frame2.getContentPane().add(btnNewButton_3);
    }



    public void Edit_tab() throws IOException {
        System.out.print(Orders + " ");
        System.out.print(Tab + " ");
        String str = "";
        FileWriter fw = new FileWriter("tab_1.txt");
        FileWriter fw2 = new FileWriter("order.txt");
        while (!Orders.isEmpty() && !Tab.isEmpty()) {
            str = Orders.peek() + ": " + Tab.peek();
            Orders.poll();
            Tab.poll();
            System.out.print(str + " ");


            // attach a file to FileWriter 


            // read character wise from string and write 
            // into FileWriter 


            for (int i = 0; i < str.length(); i++) {
                fw2.write(str.charAt(i));

            }
            fw2.write('\n');


            for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
            fw.write('\n');

            System.out.println("Writing successful");
            //close the file 


        }
        fw.close();
        fw2.close();


    }

    //keeps instance of frame 
    public void set_instance(JFrame instance) {

        this.instance = instance;



    }









}  
