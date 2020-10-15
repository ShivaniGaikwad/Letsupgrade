import java.util.Scanner;

public class Employee
{
    Scanner sc= new Scanner(System.in);
    String name;
    String city;
    int age;

    public void getDetails()
    {   

        System.out.println("Enter name : ");
        name=sc.next();
        System.out.println("Enter city : ");
        city=sc.next();
        System.out.println("Enter age : ");
        age=sc.nextInt();
    }
    public void displayDetails()
    {   
        System.out.println("The name is "+name);

        System.out.println("The city is "+city);

        System.out.println("The age is "+age);
    }

    public static void main(String [] args)
    {
        Employee e= new Employee();
        e.getDetails();
        e.displayDetails();

        Employee e2= new Employee();
        e2.getDetails();
        e2.displayDetails();
        
    }

}
