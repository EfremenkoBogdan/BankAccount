import All_clients.Clients;

public class Main 
{
	public static void main (String[] args)
	{
DepositAccount depositAccount = new DepositAccount (50000);
depositAccount.setTakeRuble(5000);
System.out.println (depositAccount.getRuble());

	}
}
