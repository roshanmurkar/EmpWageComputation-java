import java.util.Random;
public class EmpWageComputation {

        public static void main(String args[]) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random num = new Random ();
		int WagePerHour = 20;
		int FulldayHour = 8;
		int PartTimeHour= 8;
		int NumWorkingDays=20;
		int Totalsalary=0;
		int salary1=0;
		int salary2=0;
		int salary3=0;
		int sal2=0;
		int sal3=0;
		int Absent=0;
		int Fullday=0;
		int Halfday=0;
		
		for (int day=1; day<= NumWorkingDays; day++){
				int CheckAvail= num.nextInt(3);
    
				switch  (CheckAvail) {
	            case 0:
		 			Absent++;
					salary1= 0 * WagePerHour;
					break;
				case 1:
					Fullday++;
					sal2=  FulldayHour * WagePerHour;
					salary2= salary2 + sal2 ;
					break;
				case 2:
					Halfday++;
					sal3= PartTimeHour * WagePerHour;
					salary3 = salary3 + sal3 ;
					break;
				}
		}
				 Totalsalary = salary1 + salary2 + salary3 ;
					System.out.println( "Number of days Absent is " + Absent );
					System.out.println( "Number of Fulldays present is  " + Fullday );
					System.out.println( "Number of Halfdays present is " +Halfday );
                    System.out.println( "The total salary of the employee is  " + Totalsalary );
	}
}