import java.util.Scanner;

public class IT26102367Lab3Q2{
	public static void main(){
		
		Scanner input=new Scanner(System.in);
		
		double monthlySalary,otHours,otRate,otAmount,totalSalary;
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary= input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		otHours= input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		otRate= input.nextDouble();
		
		otAmount=otHours*otRate;
		totalSalary=monthlySalary+otAmount;
		
		System.out.print("The total salary including OT is: "+totalSalary);
	}
}
