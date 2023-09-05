public abstract class BankAccount 
{
	private int ruble;
	
	public BankAccount (int ruble)
{
	this.ruble = ruble;
}
	public int getRuble () 
	{
	return ruble;	
	}
	
	public void setRuble(int ruble)
	{
		this.ruble = ruble;
	}
	
	public void setTakeRuble(int TakeRuble)
	{
		this.ruble = ruble - TakeRuble;
	}	
	
	public void setInsertRuble(int InsertRuble)
	{
		this.ruble = ruble + InsertRuble;
	}	

	public void setTakeRubleWithCommision(int setTakeRubleWithCommision)
	{
		this.ruble = (ruble - setTakeRubleWithCommision) - (int) (setTakeRubleWithCommision * 0.01);
	}	
	
	public void setTakeRubleDeposit(int TakeRubleDeposit)
	{
		this.ruble = ruble - TakeRubleDeposit;
	}	

	
}
