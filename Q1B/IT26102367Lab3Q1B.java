import java.util.Scanner;
public class  IT26102367Lab3Q1B{
	public static void main(String[]args){
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice: ");
	double price=input.nextInt();
	
	System.out.print("Enter the number of kilograms you want to buy: ");
	double kilo=input.nextInt();
	
	double total=(price*kilo)-((price*kilo)*10/100);
	
	System.out.print("The total amount with 10% discount is: "+ total);
	
    }
}