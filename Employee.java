import java.io.*;
import java.util.Scanner;



public class Employee {


    String username = "";
    private String password = "";
    int ID;
    boolean is_logged_in;
    boolean is_clocked_in;


    boolean is_waiter;



    public Employee() {



    }




    String Getpassword() {

        return password;
    }





    String Getusername() {


        return username;
    }



    int GetID() {

        return ID;
    }



    void set_password(String y) {

        this.password = y;

    }



    void set_username(String y) {

        this.username = y;

    }



    void set_ID(int y) {

        this.ID = y;

    }

    void set_Login_status(boolean y) {

        this.is_logged_in = y;


    }

    boolean Get_status() {

        return is_logged_in;


    }

    void logout() {

        this.is_logged_in = false;

    }



    public static int stringCompare(String str1, String str2) {

        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int) str1.charAt(i);
            int str2_ch = (int) str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        // Edge case for strings like
        // String 1="Geeks" and String 2="Geeksforgeeks"
        if (l1 != l2) {
            return l1 - l2;
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }


    Employee find_employee() // returns an Employee with username and password
    {
        Employee user = new Employee();

        Scanner in = new Scanner(System.in);
        System.out.println("enter Username");
        String s = in .nextLine();
        user.set_username(s);
        System.out.println("enter password");
        String p = in .nextLine();
        user.set_password(p); in .close();
        return user;

    }


    Employee employee_login(Employee user) throws FileNotFoundException {

        // user=find_employee();

        int i = 0;
        String line = "";

        File myfile = new File("username.txt");
        Scanner sc = new Scanner(myfile);

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            i++;
            //System.out.println(user.Getusername());
            // System.out.println(line);
            if (stringCompare(line, user.Getusername()) == 0) {
                user.set_ID(i);
                // System.out.println(i);
            } else {
                // System.out.println("No user found"); 

            }

        }

        sc.close();
        File myfile2 = new File("Passwords.txt");
        i = 0;
        sc = new Scanner(myfile2);


        while (sc.hasNextLine()) {
            line = sc.nextLine();
            i++;

            if (stringCompare(line, user.Getpassword()) == 0 && i == user.GetID()) {
                user.set_Login_status(true);
                // System.out.println(i);
            } else {
                //  System.out.println("Wrong password"); 

            }

        }

        sc.close();


        return user;

    }





}









/* Employee employee_login(Employee user) throws FileNotFoundException{
    
    user=find_employee();
    
int i=0;
String line="";

File myfile =new File("C:\\Users\\ethan\\eclipse-workspace\\Prototype2\\src\\username.txt");
	    Scanner sc = new Scanner(myfile);
	  
	    while (sc.hasNextLine()) {
	      
	    System.out.println(sc.nextLine());
	      line=sc.nextLine();
	      i++;
	        if(line==username){
	        	System.out.println("User "+username);
	         ID=i;
	      }
	    



}

i=0; 
File myfile2 =new File("C:\\Users\\ethan\\eclipse-workspace\\Prototype2\\src\\Passwords.txt");
Scanner scan = new Scanner(myfile2);
  i++;
  while (scan.hasNextLine()) {
      
	    System.out.println(scan.nextLine());
	      line=scan.nextLine();
	      i++;
  if(line==password && i==ID){
    	System.out.println("Logged in");
        is_logged_in=true;
  }
  }
return user;
}



}
	 
	 
	*/