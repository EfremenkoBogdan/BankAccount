import java.util.Scanner;

public class DepositAccount extends BankAccount 
{
	public DepositAccount (int ruble)
	{
		super (ruble);
	}
	public void setTakeRuble(int TakeRuble)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println ("How long you keep deposit in day");
		int day = scanner.nextInt();
		if (day < 30)
		{
		System.out.println ("Sorry, you can`t take your money, because too short period");
		}
		else 
		{
			setTakeRubleDeposit (TakeRuble);
		}
	}	
}
