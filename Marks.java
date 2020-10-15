import java.util.Scanner;

public class Marks
{
    Scanner sc= new Scanner(System.in);
    int maths,sci,alg,geo,hist;
    float per,totalmarks;


    public void getDetails()
    {   

        System.out.println("Enter maths marks : ");
        maths=sc.nextInt();

        System.out.println("Enter science marks : ");
        sci=sc.nextInt();
        
        System.out.println("Enter algebra marks : ");
        alg=sc.nextInt();
        
        System.out.println("Enter geometry marks : ");
        geo=sc.nextInt();

        System.out.println("Enter history marks : ");
        hist=sc.nextInt();
    }

    public void displayDetails()
    {   
        totalmarks=(maths+sci+alg+geo+hist);
        per=(totalmarks*100)/500;
        System.out.println("The total marks are: "+totalmarks);
        System.out.println("Percentage :: "+per);
        if(per>=70)
        {
            System.out.println("Grade A!!!");
        }
        else if(per>=65)
        {
             System.out.println("Grade B!!!");
        }
        else if(per>=60)
        {
             System.out.println("Grade C!!!");
        }
        else if(per>=50)
        {
             System.out.println("Grade D!!!");
        }
        else if(per>=35)
        {
             System.out.println("Grade E!!!");
        }
        else
        
        {
             System.out.println("FAIL");
        }
    }

    public static void main(String [] args)
    {
        Marks m= new Marks();
        m.getDetails();
        m.displayDetails();
    }

}
