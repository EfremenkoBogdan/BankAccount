package All_clients;

public abstract class Clients {

protected int money;
	
	public Clients (int money)
	{
	this.money = money;
	}
		
	public abstract int getMoney();
	
	public abstract void setInsertMoney(int InsertMoney);
	
	public abstract void setTakeMoney(int TakeMoney);	
	
}
