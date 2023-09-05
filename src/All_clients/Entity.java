package All_clients;

public class Entity extends Clients 
{
	public Entity (int money)
	{
		super (money);
	}
	
	public int getMoney()
	{
		System.out.println ("You are entity, no commision for you");
		return money;
	}
	
	public  void setInsertMoney(int InsertMoney)
	{
		System.out.println ("You are entity, no commision for you");
		this.money = money + InsertMoney;
	}
	
	public void setTakeMoney(int TakeMoney)
	{
		System.out.println ("You are entity, commision for you 1%");
		this.money = (money - TakeMoney) - (int) (TakeMoney * 0.001);
	}	

}
