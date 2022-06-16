import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



//table class with stander getter and setter functions
public class Table {

    Queue < String > Orders = new PriorityQueue < > ();
    Queue < Double > Tab = new PriorityQueue < > ();
    Employee User = new Employee();

    Table(Queue < String > Orders, Queue < Double > Tab) {
        this.Orders = Orders;
        this.Tab = Tab;


    }

    public void additem(String Item, double Price) {

        this.Orders.add(Item);
        this.Tab.add(Price);


    }

    public void removeitem(String Item, double Price) {

        this.Orders.remove(Item);
        this.Tab.remove(Price);


    }


    public Queue < String > get_Orders() {



        return this.Orders;
    }

    public void set_Tab(Queue < String > Orders, Queue < Double > Tab) {

        this.Orders = Orders;
        this.Tab = Tab;


    }





}