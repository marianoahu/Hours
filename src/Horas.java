
import java.util.Scanner;

class Horas {

public static void main(String args[]){	
	
	Scanner sc=new Scanner(System.in);
	 
	System.out.println("Enter your first name");
	String firstName=sc.next();
	System.out.println("Enter your last name");
	String lastName=sc.next();
	System.out.println("Hourly payment");
	double hourlyPayment=sc.nextFloat();
	System.out.println("Indicate the day of the week");
	String dayOfTheWeek=sc.next();
	System.out.println("Indicate the day of the month in numbers");
	int dayOfTheMonth=sc.nextInt();
	System.out.println("How many hours did you work today?");
	int hoursToday=sc.nextInt();
	
	double dailyIncome= hourlyPayment * hoursToday;
	
	
	System.out.println("First name:"+firstName+" Last name:"+lastName+" Hourly payment:"+hourlyPayment+" Today is:"+dayOfTheWeek+" "+dayOfTheMonth);
	System.out.println("Today you have made "+ dailyIncome);
	
	System.out.println("Have you made extra hours today? Yes or No");
	String answer=sc.next();
		if (("Yes" .equals(answer)))
			{
			System.out.println("How many?");
			int extraHours=sc.nextInt();
			
			double extraHoursP= 0.65;		
			double moneyExtraHours= extraHours * extraHoursP;
			System.out.println("Your income from extra hours today is "+ moneyExtraHours);
			double totalIncome= dailyIncome + moneyExtraHours;
			System.out.println("You total income today is "+ totalIncome);
			
			}
				
		
		else
			{
			System.out.println("Lame");
	
			}
			
	
	
	sc.close();
			}
}
