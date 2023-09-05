package All_clients;

public class Individual extends Clients 
{
	public Individual  (int money)
	{
		super (money);
	}
	
	public int getMoney()
	{
		System.out.println ("You are our favorite client, no commision for you");
		return money;
	}
	
	public  void setInsertMoney(int InsertMoney)
	{
		System.out.println ("You are our favorite client, no commision for you");
		this.money = money + InsertMoney;
	}
	
	public void setTakeMoney(int TakeMoney)
	{
		System.out.println ("You are our favorite client, no commision for you");
		this.money = money - TakeMoney;
	}	
}

