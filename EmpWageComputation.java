import java.util.Random;

public class EmpWageComputation {

        public static void main(String args[]) {

                System.out.println("Welcome to Employee Wage Computation Program");
                Random num = new Random ();
                int CheckAvail= num.nextInt(3);
                System.out.println(" CheckAvail is " + CheckAvail);
                int WagePerHour = 20;
                int FulldayHour = 8;
                int PartTimeHour = 8;
          if (CheckAvail == 1)
          {
			int EmpFulldayWage =  WagePerHour * FulldayHour ;
			System.out.println("Employee is Present and Employee fullday Wage is " + EmpFulldayWage);
          }
          else if (CheckAvail == 2)
                {
                	int EmpHalfdayWage =  WagePerHour * PartTimeHour ;
                	System.out.println("Employee is Present and Employee half day Wage is " + EmpHalfdayWage);
                }
          		else 
          			System.out.println("Employee is Absent " );

        }


}
