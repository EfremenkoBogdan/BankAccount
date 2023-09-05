package All_clients;

public class IndividualEnterpreneur extends Clients 
{
	public IndividualEnterpreneur  (int money)
	{
		super (money);
	}
	
	public int getMoney()
	{
		System.out.println ("You are individual entrepreneur, no commision");
		return money;
	}
	
	public  void setInsertMoney(int InsertMoney)
	{
		System.out.println ("You are individual entrepreneur, commision for you - if 1000 rub 1%, if less 1000 5%");
		if (InsertMoney > 1000) {
		this.money = (money + InsertMoney) - (int) (InsertMoney * 0.001);
		}
		else if (InsertMoney <= 1000) {
			this.money = (money + InsertMoney) - (int) (InsertMoney * 0.005);
		}
	}
	
	public void setTakeMoney(int TakeMoney)
	{
		System.out.println ("You are individual entrepreneur, no commision");
		this.money = money - TakeMoney;
	}	
}
