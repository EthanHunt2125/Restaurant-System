import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.*;








//main window shows all the tables and which one Employee has
public class GUI extends JPanel implements ActionListener {
    protected static final Color Green = null;
    protected JTextField textField = new JTextField();
    public JFrame frame;
    JPasswordField passwordField;
    Button b;
    Employee user = new Employee();
    Queue < String > Order = new PriorityQueue < > ();
    Queue < String > Order_update = new PriorityQueue < > ();
    JLabel lable = new JLabel("login");


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI window = new GUI();
                    window.frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }







    /**
     * Create the application.
     * @throws FileNotFoundException 
     */
    public GUI() throws FileNotFoundException {
        initialize();
    }

    public GUI(Employee user) throws FileNotFoundException {
        this.user = user;
        initialize();

    }

    public GUI(Queue < String > orders) throws FileNotFoundException {
        this.Order_update = orders;
        initialize();





    }

    public GUI(Queue < String > orders, Employee user) throws FileNotFoundException {
        this.user = user;
        this.Order_update = orders;
        initialize();





    }






    /**
     * Initialize the contents of the frame.
     * @throws FileNotFoundException 
     */




    private void initialize() throws FileNotFoundException {

        addNewOrders();
        try {
            update();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }



        frame = new JFrame();
        frame.setBounds(0, 0, 450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
//lots code for the buttons fof the table
        JButton btnNewButton = new JButton("Table 1");

        btnNewButton.addMouseListener(new MouseAdapter() {


            @Override
            public void mouseClicked(MouseEvent e) {

                Table_GUI window2 = new Table_GUI(user);

                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);

            }
        });
        btnNewButton.setBounds(27, 50, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Table 2");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnNewButton_1.setBackground(Color.YELLOW);

                Table_GUI window2 = new Table_GUI(user);

                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);



            }
        });
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                Table_GUI window2 = new Table_GUI(user);

                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);




            }
        });
        btnNewButton_1.setBounds(27, 100, 89, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Table 3");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);

                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);



            }
        });
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Table_GUI window2 = new Table_GUI(user);

                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);



            }
        });
        btnNewButton_2.setBounds(27, 150, 89, 23);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Table 4");
        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);

            }
        });
        btnNewButton_3.setBounds(27, 200, 89, 23);
        frame.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Table 9");
        btnNewButton_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);

            }
        });
        btnNewButton_4.setBounds(126, 50, 89, 23);
        frame.getContentPane().add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Table 10");
        btnNewButton_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);

            }
        });
        btnNewButton_5.setBounds(126, 100, 89, 23);
        frame.getContentPane().add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("Table 11");
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);

            }
        });
        btnNewButton_6.setBounds(126, 150, 89, 23);
        frame.getContentPane().add(btnNewButton_6);

        JButton btnNewButton_7 = new JButton("Table 12");
        btnNewButton_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);



            }
        });
        btnNewButton_7.setBounds(126, 200, 89, 23);
        frame.getContentPane().add(btnNewButton_7);

        JButton btnNewButton_7_1 = new JButton("Table 13");
        btnNewButton_7_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_1.setBounds(126, 241, 89, 23);
        frame.getContentPane().add(btnNewButton_7_1);

        JButton btnNewButton_7_2 = new JButton("Table 14");
        btnNewButton_7_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_2.setBounds(126, 281, 89, 23);
        frame.getContentPane().add(btnNewButton_7_2);

        JButton btnNewButton_7_3 = new JButton("Table 15");
        btnNewButton_7_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_3.setBounds(126, 315, 89, 23);
        frame.getContentPane().add(btnNewButton_7_3);

        JButton btnNewButton_7_4 = new JButton("Table 16");
        btnNewButton_7_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4.setBounds(126, 349, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4);

        JButton btnNewButton_7_1_1 = new JButton("Table 5");
        btnNewButton_7_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_1_1.setBounds(27, 241, 89, 23);
        frame.getContentPane().add(btnNewButton_7_1_1);

        JButton btnNewButton_7_1_2 = new JButton("Table 6");
        btnNewButton_7_1_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_1_2.setBounds(27, 281, 89, 23);
        frame.getContentPane().add(btnNewButton_7_1_2);

        JButton btnNewButton_7_1_3 = new JButton("Table 7");
        btnNewButton_7_1_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_1_3.setBounds(27, 315, 89, 23);
        frame.getContentPane().add(btnNewButton_7_1_3);

        JButton btnNewButton_7_4_1 = new JButton("Table 8");
        btnNewButton_7_4_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_1.setBounds(27, 349, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_1);

        JButton btnNewButton_7_4_2 = new JButton("Table 17");
        btnNewButton_7_4_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_2.setBounds(225, 50, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_2);

        JButton btnNewButton_7_4_3 = new JButton("Table 25");
        btnNewButton_7_4_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_3.setBounds(324, 50, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_3);

        JButton btnNewButton_7_4_4 = new JButton("Table 18");
        btnNewButton_7_4_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_4.setBounds(225, 100, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_4);

        JButton btnNewButton_7_4_5 = new JButton("Table 26");
        btnNewButton_7_4_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_5.setBounds(324, 100, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_5);

        JButton btnNewButton_7_4_6 = new JButton("Table 19");
        btnNewButton_7_4_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_6.setBounds(225, 150, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_6);

        JButton btnNewButton_7_4_7 = new JButton("Table 27");
        btnNewButton_7_4_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_7.setBounds(324, 150, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_7);

        JButton btnNewButton_7_4_8 = new JButton("Table 20");
        btnNewButton_7_4_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_8.setBounds(225, 200, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_8);

        JButton btnNewButton_7_4_9 = new JButton("Table 28");
        btnNewButton_7_4_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_9.setBounds(324, 200, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_9);

        JButton btnNewButton_7_4_10 = new JButton("Table 21");
        btnNewButton_7_4_10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_10.setBounds(225, 241, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_10);

        JButton btnNewButton_7_4_11 = new JButton("Table 29");
        btnNewButton_7_4_11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI();
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_11.setBounds(324, 241, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_11);

        JButton btnNewButton_7_4_12 = new JButton("Table 22");
        btnNewButton_7_4_12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI();
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_12.setBounds(225, 281, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_12);

        JButton btnNewButton_7_4_13 = new JButton("Table 30");
        btnNewButton_7_4_13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_13.setBounds(324, 281, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_13);

        JButton btnNewButton_7_4_14 = new JButton("Table 23");
        btnNewButton_7_4_14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_14.setBounds(225, 315, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_14);

        JButton btnNewButton_7_4_16 = new JButton("Table 24");
        btnNewButton_7_4_16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Table_GUI window2 = new Table_GUI(user);
                window2.frame2.setVisible(true);
                window2.set_instance(frame);
                Order_update = window2.table.Orders;
                addNewOrders();
                try {
                    update();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);


            }
        });
        btnNewButton_7_4_16.setBounds(225, 349, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_16);

        JButton btnNewButton_7_4_17 = new JButton("Logout");
        btnNewButton_7_4_17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            try {
				update2();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            	frmTest window = new frmTest();
                window.frame.setVisible(true);
                frame.setVisible(false);





            }
        });


        btnNewButton_7_4_17.setBounds(324, 349, 89, 23);
        frame.getContentPane().add(btnNewButton_7_4_17);

        JButton btnNewButton_8 = new JButton("Print OrderQ Toconsole ");
        btnNewButton_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String line = "";

                double price;
                File myfile = new File("order.txt");
                Scanner sc = null;
                try {
                    sc = new Scanner(myfile);
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

                while (sc.hasNextLine()) {
                    line = sc.nextLine();


                    System.out.println(line);




                }

                sc.close();
            }



        });
        btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewButton_8.setBounds(27, 11, 169, 23);
        frame.getContentPane().add(btnNewButton_8);

      //End of lots code for the buttons of the table


//code to tell what employee has which tables
        
        if (user.ID == 1) {


            btnNewButton_7_4_1.setBackground(Color.GREEN);
            btnNewButton_1.setBackground(Color.GREEN);
            btnNewButton_2.setBackground(Color.GREEN);

            btnNewButton_3.setBackground(Color.YELLOW);
            btnNewButton_4.setBackground(Color.RED);
            btnNewButton_5.setBackground(Color.RED);
            btnNewButton_6.setBackground(Color.GREEN);

            btnNewButton_7_1.setBackground(Color.YELLOW);
            btnNewButton_7_2.setBackground(Color.GREEN);;
            btnNewButton_7_3.setBackground(Color.GREEN);




        }


        if (user.ID == 2) {


            btnNewButton_7_1_3.setBackground(Color.RED);;
            btnNewButton_7_1_1.setBackground(Color.YELLOW);
            btnNewButton_7_1_2.setBackground(Color.YELLOW);;

            btnNewButton_7_4_3.setBackground(Color.RED);
            btnNewButton_7_4_4.setBackground(Color.GREEN);
            btnNewButton_7_4_5.setBackground(Color.GREEN);
            btnNewButton_7_4_6.setBackground(Color.YELLOW);

            btnNewButton_7_4_7.setBackground(Color.YELLOW);
            btnNewButton_7_4_8.setBackground(Color.GREEN);
            btnNewButton_7_4_9.setBackground(Color.GREEN);



        }

        if (user.ID == 3) {




            btnNewButton_7_4_10.setBackground(Color.RED);
            btnNewButton_7_4_11.setBackground(Color.RED);
            btnNewButton_7_4_12.setBackground(Color.YELLOW);
            btnNewButton_7_4_13.setBackground(Color.RED);

            btnNewButton_7_4_14.setBackground(Color.YELLOW);
            btnNewButton_7_4_17.setBackground(Color.GREEN);

            btnNewButton_7_4.setBackground(Color.RED);
            btnNewButton_7.setBackground(Color.GREEN);
            btnNewButton_7_4.setBackground(Color.GREEN);


        }






    }







  //code to update order queue text file

    public void update() throws IOException {

       
    	 FileWriter fw2 = new FileWriter("order.txt");
         while (!Order.isEmpty()) {
             String str = Order.peek();
             Order.poll();

             System.out.print(str + " ");


             // attach a file to FileWriter 


             // read character wise from string and write 
             // into FileWriter 


             for (int i = 0; i < str.length(); i++) {
                 fw2.write(str.charAt(i));

             }
             fw2.write('\n');




             System.out.println("Writing successful");
             //close the file 


         }

         fw2.close();




    }

    public void update2() throws IOException {

        FileWriter fw2 = new FileWriter("order.txt");
        while (!Order.isEmpty()) {
            String str = Order.peek();
            Order.poll();

            System.out.print(str + " ");


            // attach a file to FileWriter 


            // read character wise from string and write 
            // into FileWriter 


            for (int i = 0; i < str.length(); i++) {
                fw2.write(str.charAt(i));

            }
            fw2.write('\n');




            System.out.println("Writing successful");
            //close the file 


        }

        fw2.close();



    }






    //code to combine order queue total to text file

    public void addNewOrders() {
        // System.out.print( "Hi I am working "+ Order_update);	
        while (!Order_update.isEmpty()) {
            System.out.print(Order_update.peek() + " ");
            Order.add(Order_update.peek());
            Order_update.poll();




        }



    }









    public void actionPerformed(ActionEvent event) {
        // settext of textfield object of Jtextfield

        char[] user_password = passwordField.getPassword();

        String str = new String(user_password);


        user.set_password(str);

        try {
            user.employee_login(user);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        lable.setText("button is clicked");
    }
}