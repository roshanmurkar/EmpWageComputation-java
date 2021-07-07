import java.util.Random;

public class EmpWageComputation {

        public static void main(String args[]) {

                System.out.println("Welcome to Employee Wage Computation Program");
		 Random num = new Random ();
                int CheckAvail= num.nextInt(2);
                System.out.println(" CheckAvail is " + CheckAvail);

                if (CheckAvail == 1)
                		System.out.println("Employee is Present");
                else 
                		System.out.println("Employee is Absent");

                

	}
}
